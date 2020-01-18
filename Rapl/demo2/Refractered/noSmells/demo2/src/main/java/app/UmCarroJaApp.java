package app;
/**
 * Esta classe é responsável pela apresentação do menu ao utilizador e
 * pelo tratamento de todo o input / output.
 * As variáveis de instância são a classe model.UmCarroJa que contém as
 * estruturas de dados utilizadas, bem como manuseamento das mesmas, para
 * além de três menus principais, gerados a partir da classe Menu.
 * 
 * 
 * 
 * 
 * @version 20190415
 */

import exceptions.*;
import model.*;
import utils.Coordinate;
import utils.Input;
import view.Menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

import java.lang.reflect.Field;

public class UmCarroJaApp{
    
    /** Variáveis de Classe */
    
    /* Instância da classe model.UmCarroJa */
    private static UmCarroJa ucj;
    
    /* Menu inicial da aplicação */
    private static Menu menuInicial;
    /* Menu dos utilizadores da aplicação */
    private static Menu menuUtilizador;
    /* Menu do administrador da aplicação */
    private static Menu menuAdmin;
    /* Menu do proprietário */
    private static Menu menuProprietario;
    /* Menu do cliente */
    private static Menu menuCliente;
    
    /* Nome do ficheiro de dados a gravar / ler */
    private static String ficheiroDados = "UCJ.dat";
    
    /* Data de início da aplicação */
    private static GregorianCalendar dataInicioApp;

    static final String SEPARADOR = "------------------------------------------------\n";
    static final String VEICULO = "O VeÍculo ";
    static final String JA_REGISTADO = " já está registado!\n";
    static final String NAO_EXISTE = " não existe!\n";
    static final String NAO_PERTENCE = " não lhe pertence!\n";
    static final String NAO_EXISTEM_VEICULOS = "Não existem veículos disponíveis para alugar!\n";
    static final String NAO_EXISTEM_ALUGUERES_DATAS = "Não existem alugures entre essas datas.";
    static final String OPCAO_INVALIDA = "Opção não suportada!";
    static final String VALOR_INVALIDO = "Valor inválido!";
    static final String EMAIL_INVALIDO = "Email inválido!";
    static final String LATITUDE_INVALIDA = "Latitude Inválida!";
    static final String LONGITUDE_INVALIDA = "Longitude Inválida!";
    static final String MATRICULA_INVALIDA = "Matrícula Inválida!";
    static final String DATA_FIM_INVALIDA = "Data de fim inválida!";
    static final String DATA_INICIO_INVALIDA = "Data de início inválida!";
    static final String DATA_INICIO_ALUGUER_INVALIDA = "Data de Início de model.Aluguer Inválida!";
    static final String MATRICULA_A_ALUGAR = "Introduza a Matrícula do Veículo que Pretende Alugar: ";
    static final String DIGITAR_MATRICULA = "Digite a matricula do Veículo: ";
    static final String DIGITAR_LATITUDE_DESTINO = "Digite a latitude de destino: ";
    static final String DIGITAR_LONGITUDE_DESTINO = "Digite a longitude de destino: ";
    static final String DIGITAR_DATA_FIM_ALUGUER = "Digite a Data de Fim de model.Aluguer (dd-mm-aaaa): ";
    static final String DIGITAR_DATA_INICIO_ALUGUER = "Digite a Data de Início de model.Aluguer (dd-mm-aaaa): ";
    static final String LATITUDE_DENOVO = "Digite novamente a latitude: ";
    static final String LONGITUDE_DENOVO = "Digite novamente a longitude: ";
    static final String MATRICULA_DENOVO = "Digite Novamente a Matrícula do Veículo: ";
    static final String DATA_INICIO_DENOVO = "Digite Novamente a Data de Início (dd-mm-aaaa): ";
    static final String DATA_INICIO_ALUGUER_DENOVO = "Digite Novamente a Data de Início de model.Aluguer (dd-mm-aaaa): ";
    static final String DATA_FIM_ALUGUER_DENOVO = "Digite Novamente a Data de Fim de model.Aluguer (dd-mm-aaaa): ";
    static final String NUMERO_VEICULOS_DENOVO = "Digite novamente o numero de veiculos que deseja ver: ";
     public native static int scale(int freq);
    public native static int[] freqAvailable();

    public native static double[] GetPackagePowerSpec();
    public native static double[] GetDramPowerSpec();
    public native static void SetPackagePowerLimit(int socketId, int level, double costomPower);
    public native static void SetPackageTimeWindowLimit(int socketId, int level, double costomTimeWin);
    public native static void SetDramTimeWindowLimit(int socketId, int level, double costomTimeWin);
    public native static void SetDramPowerLimit(int socketId, int level, double costomPower);
    public native static int ProfileInit();
    public native static int GetSocketNum();
    public native static String EnergyStatCheck();
    public native static void ProfileDealloc();
    public native static void SetPowerLimit(int ENABLE);
    public static int wraparoundValue;

    public static int socketNum;
    static {
        System.setProperty("java.library.path", System.getProperty("user.dir"));
        try {
            Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
            fieldSysPath.setAccessible(true);
            fieldSysPath.set(null, null);
        } catch (Exception e) { }

        System.loadLibrary("CPUScaler");
        wraparoundValue = ProfileInit();
        socketNum = GetSocketNum();
    }

    /**
     * @return an array of current energy information.
     * The first entry is: Dram/uncore gpu energy(depends on the cpu architecture.
     * The second entry is: CPU energy
     * The third entry is: Package energy
     */

    public static double[] getEnergyStats() {
        socketNum = GetSocketNum();
        String EnergyInfo = EnergyStatCheck();
        //System.out.println(EnergyInfo);
        /*One Socket*/
        if(socketNum == 1) {
            double[] stats = new double[3];
            String[] energy = EnergyInfo.split("#");

            stats[0] = Double.parseDouble(energy[0].replaceFirst(",","."));
            stats[1] = Double.parseDouble(energy[1].replaceFirst(",","."));
            stats[2] = Double.parseDouble(energy[2].replaceFirst(",","."));

            return stats;

        } else {
            /*Multiple sockets*/
            String[] perSockEner = EnergyInfo.split("@");
            double[] stats = new double[3*socketNum];
            int count = 0;


            for(int i = 0; i < perSockEner.length; i++) {
                String[] energy = perSockEner[i].split("#");
                for(int j = 0; j < energy.length; j++) {
                    count = i * 3 + j;	//accumulative count
                    stats[count] = Double.parseDouble(energy[j].replaceFirst(",","."));
                }
            }
            return stats;
        }

    }
    /** O construtor é privado, pois não queremos instâncias da mesma. */
    private UmCarroJaApp() {}

    /** Métodos de Classe */

    /**
     * Inicia os diferentes Menus da aplicação, respetivamente o Menu Inicial,
     * o Menu do Proprietário e o Menu do model.Cliente.
     */
    private static void initMenus(){
        String[] inicial =      {"Menu Inicial", 
                                 "Menu model.Utilizador",
                                 "Menu Administração",
                                 "Guardar Dados da Aplicação"};
                                 
        String[] utilizador =   {"Menu model.Utilizador",
                                 "Iniciar Sessão", 
                                 "Registar model.Utilizador"};
                                 
        String[] admin =        {"Menu Administração", 
                                 "Extrato de model.Aluguer de uma Viatura num Determinado Período",
                                 "10 Clientes com Mais Alugueres",
                                 "10 Clientes com Mais Km Percorridos"};
        
        String[] proprietario = {"Menu Proprietário",
                                 "Registar Viatura",
                                 "Sinalizar Viatura Disponível", 
                                 "Abastecer Veículo", 
                                 "Alterar o Preço por Km", 
                                 "Aceitar/Rejeitar Alugueres", 
                                 "Registar Suplemento no Preço da Viagem",
                                 "Meus Alugueres",
                                 "Valor Faturado entre Datas"};
        
        String[] cliente =      {"Menu model.Cliente",
                                 "Alugar Veículo Mais Próximo", 
                                 "Alugar Veículo Mais Barato", 
                                 "Alugar Veículo Mais Barato num Perímetro", 
                                 "Alugar Viatura Específica", 
                                 "Alugar Viatura com Determinada Autonomia",
                                 "Meus Alugueres"};
        
        menuInicial = new Menu(inicial);
        menuUtilizador = new Menu(utilizador);
        menuAdmin = new Menu(admin);
        menuProprietario = new Menu(proprietario);
        menuCliente = new Menu(cliente);
    }

    /**
     * @brief Método responsável por ler a data de hoje do utils.Input e fazer a comparação com a data
     * guardada no ficheiro de dados.
     */
    private static void lerData(){
        GregorianCalendar dataAtual;
        out.print("Digite a Data do Dia de Hoje (dd-mm-aaaa): ");
        do {
            dataAtual  = Input.lerData("Data de Hoje Inválida! Digite Novamente a Data (dd-mm-aaaa): ", "Digite a Data do Dia de Hoje (dd-mm-aaaa): ");
        }while ((!(dataInicioApp.equals(dataAtual)) || dataAtual.before(dataInicioApp)));
        dataInicioApp = dataAtual;
        UmCarroJaApp.guardarDados();
    }

    /**
     * Método responsável por limpar o terminal do IDE BlueJ.
     * Retirado da página de tips da blueJ.org.
     *
     * Este método não deverá funcionar noutros IDE's excepto BlueJ.
     */
    private static void clearScreen(){
        System.out.print('\u000C');
    }
    
    public static void main(String[] args){
        initMenus();
        ucj = new UmCarroJa();
         double[]  before = getEnergyStats();
        lerDadosTXT("logsPOO_carregamentoInicial.bak");
        double[] after = getEnergyStats();  
        System.out.println("Energy consumption of dram: " + (after[0] - before[0])+ " Energy consumption of cpu: " + (after[1] - before[1])+ " Energy consumption of package: " + (after[2] - before[2]));
        out.println("NÚMERO UTILIZADORES: " + ucj.getNUsers());
        out.println("NÚMERO VEÍCULOS: " + ucj.getNVeiculos());
        out.println("NÚMERO ALUGUERES: " + ucj.getNAlugs());
        lerData();
        
        ucj.alugueresEfetuados(dataInicioApp);
        do{
            UmCarroJaApp.clearScreen();
            menuInicial.executa();
            switch(menuInicial.getOpcao()){
                case 1: menuUtilizador();
                    break;
                case 2: menuAdmin();
                    break;
                case 3: guardarDados();
                    break;
                default:
                    System.out.println(OPCAO_INVALIDA);
            }
        } while(menuInicial.getOpcao() != 0);
        guardarDados();
    }
    
    /******************************************************************************
     *                            MENU DOS UTILIZADORES                           *
     ******************************************************************************/
     
    private static void menuUtilizador(){
        UmCarroJaApp.clearScreen();
        do{
            menuUtilizador.executa();
            if (menuUtilizador.getOpcao() == 1) {
                try {
                    iniciarSessao();
                } catch (UtilizadorNaoExisteException e) {
                    out.println("O utilizador introduzido não se encontra registado!");
                } catch (PasswordIncorretaException p) {
                    out.println("A password que introduziu está incorreta!");
                }
            } else if(menuUtilizador.getOpcao() == 2) registarUtilizador();
        } while(menuUtilizador.getOpcao() != 0);
    }
    
    /**
     * @brief Método responsável pela exibição das informações que permitem a um utilizador autenticar-se na aplicação.
     * 
     * Primeiro pede-se e verifica-se o email e a password do utilizador. Caso o login esteja correto, verifica-se se
     * se trata de um cliente ou de um proprietário e chama-se o método respetivo para iniciar sessão. São ainda lançadas
     * as exceções exceptions.UtilizadorNaoExisteException caso o utilizador não esteja registado e a exceção
     * exceptions.PasswordIncorretaException, caso a password esteja incorreta.
     */
    private static void iniciarSessao() throws UtilizadorNaoExisteException, PasswordIncorretaException{
        String email;
        String password;
        
        UmCarroJaApp.clearScreen();
        
        out.print("Digite o seu Email: ");
        email = Input.lerString(EMAIL_INVALIDO, "Digite novamente o seu Email: ");
        
        out.print("Digite a sua Password: ");
        password = Input.lerString("Password Inválida!", "Digite novamente a sua Password: ");
        
        try{
            ucj.iniciarSessao(email, password);
            identificaUtilizador(email);
        }
        catch (UtilizadorNaoExisteException u){
            out.println("O utilizador com o email: " + u.getMessage() + NAO_EXISTE);
        }
        catch (PasswordIncorretaException p){
            out.println("A password introduzida: " + p.getMessage() + " está incorreta!");
        }
    }

    private static void identificaUtilizador(String email) {
        try{
            Utilizador user = ucj.getUtilizador(email);

            if (user instanceof Proprietario){
                UmCarroJaApp.sessaoProprietario();
            }
            else{
                UmCarroJaApp.sessaoCliente();
            }
        }catch (UtilizadorNaoExisteException e){
            out.println("O utilizador com o email: " + e.getMessage() + NAO_EXISTE);
        }
    }

    /**
     * @brief Método responsável por proceder ao registo de um utilizador na aplicação.
     *
     * São pedidas todas as informações necessárias para o registo na aplicação do utilizador
     * e no final é perguntado qual o tipo de conta que pretende. Posteriormente este é
     * inserido na base de dados da aplicação.
     */
    private static void registarUtilizador(){
        String email = "";
        String password;
        String nome;
        String nif;
        String morada;
        GregorianCalendar dataNascimento;
        
        boolean existe = true;
        int tipoUser;
        
        UmCarroJaApp.clearScreen();
        
        while(existe){
            out.print("Digite o seu Email: ");
            email = Input.lerString(EMAIL_INVALIDO, "Digite novamente o seu Email: ");
            existe = ucj.existeUtilizador(email);
            if (existe){
                out.println("Já existe um utilizador com o email introduzido!");
            }
        }
        
        out.print("Digite a sua Password: ");
        password = Input.lerString("Password Inválida!", "Digite novamente a sua Password: ");
        
        out.print("Digite o seu Nome Completo: ");
        nome = Input.lerString("Nome Inválido!", "Digite novamente o seu Nome Completo: ");
        
        out.print("Digite o seu NIF: ");
        nif = Input.lerString("NIF Inválido!", "Digite novamente o seu NIF: ");
        
        out.print("Digite a sua Morada: ");
        morada = Input.lerString("Morada Inválida!", "Digite novamente a sua Morada: ");
        
        out.print("Digite a sua Data de Nascimento (dd-mm-aaaa): ");
        dataNascimento = Input.lerData("Data de Nascimento Inválida!", "Digite novamente a sua Data de Nascimento (dd-mm-aaaa): ");
            
        tipoUser = Menu.menuLerInt(1, 2, "\n******************\n1 - Proprietário\n2 - model.Cliente.\nEscolha o Tipo de model.Utilizador: ",
                                 "Tipo de model.Utilizador Inválido!, Tente novamente!");
                                 
        if (tipoUser == 1){
            UmCarroJaApp.registarProprietario(nome, nif, email, password, morada, dataNascimento);
        }else{
            UmCarroJaApp.registarCliente(nome, nif, email, password, morada, dataNascimento);
        }
    }
    
    private static void registarProprietario(String nome, String nif, String email, String password, 
                                            String morada, GregorianCalendar data){
                                                
        Proprietario prop = new Proprietario(nome, nif, email, password, morada, data);
                                            
        try {
            ucj.registarUtilizador(prop);
            guardarDados();
        }
        catch (UtilizadorJaExisteException e) {
            out.println("O proprietário " + e.getMessage() +  JA_REGISTADO);
        }
    }
    
    private static void registarCliente(String nome, String nif, String email, String password, 
                                       String morada, GregorianCalendar data){
        double latitude;
        double longitude;
        
        out.print("Digite a sua Latitude: ");
        latitude = Input.lerDouble(LATITUDE_INVALIDA, "Digite novamente a sua Latitude: ");
        
        out.print("Digite a sua Longitude: ");
        longitude = Input.lerDouble(LONGITUDE_INVALIDA, "Digite novamente a sua Longitude: ");
        
        Coordinate cords = new Coordinate(latitude, longitude);
        
        Cliente cli = new Cliente(nome, nif, email, password, morada, data, cords, 0, 0, 0.0);
                                            
        try {
            ucj.registarUtilizador(cli);
            guardarDados();
        }
        catch (UtilizadorJaExisteException e) {
            out.println("O cliente " + e.getMessage() +  JA_REGISTADO);
        }                       
    }
    
    /******************************************************************************
     *                         FIM DO MENU DOS UTILIZADORES                       *
     ******************************************************************************/


    /******************************************************************************
     *                            MENU DA ADMINISTRAÇÃO                           *
     ******************************************************************************/
    
    private static void menuAdmin(){
        UmCarroJaApp.clearScreen();
        do{
            menuAdmin.executa();
            switch(menuAdmin.getOpcao()){
                case 1: extratoAluguerViatura();
                    break;
                case 2: clientesMaisAlugueres();
                    break;
                case 3: clientesComMaisKm();
                    break;
                default:
                    System.out.println(OPCAO_INVALIDA);
            }
        } while(menuAdmin.getOpcao() != 0);
        menuInicial.executa();
    }

    private static void extratoAluguerViatura(){
        String matricula;
        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;
        UmCarroJaApp.clearScreen();

        out.print("Digite a Matrícula do Veículo: ");
        matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);

        do {
            out.print("Digite a Data de Início (dd-mm-aaaa): ");
            dataInicio = Input.lerData(DATA_INICIO_INVALIDA, DATA_INICIO_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_FIM_INVALIDA, "Digite novamente a data de fim (dd-mm-aaaa): ");
        }while (dataFim.before(dataInicio));

        List<Aluguer> aux;
        List<Aluguer> alugs = new ArrayList<>();
        try{
            aux = ucj.getAlugueresVeiculo(matricula);
            alugs = filterAlugueresBD(aux, dataInicio, dataFim);
        } catch(VeiculoNaoExisteException e) {
            out.println("model.Veiculo " + e.getMessage() + " não existe.");
        }
        if(alugs.isEmpty()) {
            out.print(NAO_EXISTEM_ALUGUERES_DATAS);
        } else {
            for(Aluguer a : alugs){
                out.println(SEPARADOR);
                out.println(a.toString());
                out.println(SEPARADOR);
            }
        }
    }

    private static void clientesComMaisKm(){
        List <Cliente> lista = new ArrayList<>();

        try{
            lista = ucj.get10ClientesKm();
        }
        catch(NaoExistemClientesException e){
            out.println(e.getMessage());
        }

        for(Cliente c : lista){
            out.println(SEPARADOR);
            out.println(c.toString());
            out.println(SEPARADOR);
        }
    }

    private static void clientesMaisAlugueres(){
        List <Cliente> lista = new ArrayList<>();

        try{
            lista = ucj.get10ClientesAlugueres();
        }
        catch(NaoExistemClientesException e){
            out.println(e.getMessage());
        }

        for(Cliente c : lista){
            out.println(SEPARADOR);
            out.println(c.toString());
            out.println(SEPARADOR);
        }
    }
     
    /******************************************************************************
     *                         FIM DO MENU DA ADMINISTRAÇÃO                       *
     ******************************************************************************/

    
    /******************************************************************************
     *                              MENU PROPRIETÁRIOS                            *
     *****************************************************************************/
     
    private static void sessaoProprietario(){
        do{
            classificarClientes();
            clearScreen();
            menuProprietario.executa();
            switch(menuProprietario.getOpcao()){
                case 1: registarVeiculoProp();
                        break;
                case 2: setVeiculoDisponivel();
                        break;     
                case 3: abastecerVeiculoProp();
                        break;
                case 4: altPKMVeiculo();
                        break;
                case 5: analisarAlugueres();
                        break;
                case 6: suplementoPrecoAlug();
                        break;
                case 7: getListaDeAlugueres();
                        break;
                case 8: calcFactBDates();
                        break;
                default:
                        System.out.println(OPCAO_INVALIDA);
            }
        }while(menuProprietario.getOpcao() != 0);
        UmCarroJaApp.guardarDados();
        ucj.logoutUtilizador();
        menuUtilizador.executa();
    }

    private static void classificarClientes(){
        List<Aluguer> classif = new ArrayList<>();
        try{
            classif = ucj.alugueresClassificarCliente();
        }catch (NaoExistemAlugueresException e){
            out.println("Não existem alugueres disponíveis!");
        }

        boolean correto = false;
        int classificacao = 0;

        for (Aluguer alug : classif){
            out.println("--------------------- model.Aluguer ---------------------");
            out.println("Matrícula: " + alug.getMatricula());
            out.println("Email do model.Cliente: " + alug.getEmail());
            out.println("Data de Início do model.Aluguer: " + alug.getDataFim());
            out.println("Data de Fim do model.Aluguer: " + alug.getDataFim());
            out.println("---------------------------------------------------");
            do {
                out.print("Digite uma classificação para o cliente com o email: " + alug.getEmail() + " (0-100): ");
                classificacao = Input.lerInt("utils.Classificacao Inválida!", "Digite novamente a classificação (0-100): ");
                if (classificacao >= 0 && classificacao <= 100){
                    correto = true;
                }
            }while(!correto);
            ucj.classificarCliente(alug, classificacao);
        }
    }
     
    private static void registarVeiculoProp(){
        String marca; 
        String matricula = "";
        String nif = ucj.getUserNIF();
        int velocidade;
        double preco;
        double consumo;
        int autonomia;
        Coordinate posicao;
        double latitude;
        double longitude;
        boolean disponivel;
        int classificacao = 0;
        List<ParDatas> datasAlugueres = new ArrayList<>();
        
        boolean existe = true;
        int tipoVeiculo;
        
        UmCarroJaApp.clearScreen();
       
       
       while(existe){
            out.print(DIGITAR_MATRICULA);
            matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
            existe = ucj.existeVeiculo(matricula);
            if (existe){
                out.println("Já existe um veículo com a matricula introduzida!");
            }
       }
        
        out.print("Digite a marca do Veículo: ");
        marca = Input.lerString("Marca Inválida!", "Digite novamente a marca do veículo: ");
        
        out.print("Digite o velocidade média do veículo: ");
        velocidade = Input.lerInt("Velocidade média do veículo Inválida!", "Digite novamente a velocidade média do veículo: ");
        
        out.print("Digite o preço base por Km do veículo: ");
        preco = Input.lerDouble("Preço base por Km do veículo Inválida!", "Digite novamente o preço base por Km do veículo: ");
        
        out.print("Digite o consumo por Km percorrido do veículo: ");
        consumo = Input.lerDouble("Consumo por Km percorrido do veículo Inválida!", "Digite novamente o consumo por Km percorrido do veículo: ");
        
        out.print("Digite a autonomia do veículo: ");
        autonomia = Input.lerInt("Autonomia do veículo Inválida!", "Digite novamente a autonomia do veículo: ");
        
        out.print("Digite a disponibilidade do veículo [true - disponível, false - indisponível]: ");
        disponivel = Input.lerBoolean("Disponobilidade do veículo Inválida!", "Digite novamente a disponibilidade do veículo: ");
        
        out.print("Digite o latitude de localização do veículo: ");
        latitude = Input.lerDouble("Latitude de localização fo veículo Inválida!", "Digite novamente a latitude de localização do veículo: ");
        
        out.print("Digite o longitude de localização do veículo: ");
        longitude = Input.lerDouble("Longitude de localização fo veículo Inválida!", "Digite novamente a longitude de localização do veículo: ");
        
        posicao = new Coordinate(latitude, longitude);
        
        tipoVeiculo = Menu.menuLerInt(1, 3, "\n******************\n1 - Combustível.\n2 - Elétrico.\n3 - Hibrido.\nEscolha o Tipo de Veículo: ",
                                 "Tipo de Veículo Inválido!, Tente novamente!");
        Veiculo vr;                     
        if (tipoVeiculo == 1){
            vr = new CarroGasolina(marca,matricula,nif,velocidade,preco,consumo, autonomia, posicao,disponivel,classificacao,datasAlugueres);
        }else{
            if (tipoVeiculo == 2){
                vr =  new CarroEletrico(marca,matricula,nif,velocidade,preco,consumo, autonomia, posicao,disponivel,classificacao,datasAlugueres);
            }else{
                vr = new CarroHibrido(marca,matricula,nif,velocidade,preco,consumo, autonomia, posicao,disponivel,classificacao,datasAlugueres);
            }
        }

        try {
            ucj.registarVeiculo(vr);
            UmCarroJaApp.guardarDados();
        }
        catch (VeiculoJaExisteException e) {
            out.println(VEICULO + e.getMessage() +  JA_REGISTADO);
        }
    }   
     
    private static void setVeiculoDisponivel(){
        String matricula;
        boolean disp;

        UmCarroJaApp.clearScreen();
       
        out.print(DIGITAR_MATRICULA);
        matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
        
        
        out.print("Digite a disponibilidade do veículo: ");
        disp = Input.lerBoolean("Disponobilidade do veículo Inválida!", "Digite novamente a disponibilidade do veículo: ");
        
        try {
            ucj.sinalizarDisponibilidade(matricula, disp);
            UmCarroJaApp.guardarDados();
        }
        catch (VeiculoNaoExisteException e) {
            out.println(VEICULO + e.getMessage() +  NAO_EXISTE);
        }
        catch (VeiculoNaoESeuException e2) {
            out.println(VEICULO + e2.getMessage() +  NAO_PERTENCE);
        }
    }
    
    private static void abastecerVeiculoProp(){
        String matricula;
        double abast;
        
        UmCarroJaApp.clearScreen();
        
        out.print(DIGITAR_MATRICULA);
         matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
        
        
        out.print("Digite quanto desejada a abastecer: ");
        abast = Input.lerDouble("Quantidade Inválida!", "Digite novamente a quantidade a abastecer: ");
        
        try {
            ucj.abastecerVeiculo(matricula, abast);
            UmCarroJaApp.guardarDados();
        }
        catch (VeiculoNaoExisteException e) {
            out.println(VEICULO + e.getMessage() +  NAO_EXISTE);
        }
        catch (VeiculoNaoESeuException e2) {
            out.println(VEICULO + e2.getMessage() +  NAO_PERTENCE);
        }
    }
    
    private static void altPKMVeiculo(){
        String matricula;
        double pkm;
        
        UmCarroJaApp.clearScreen();
        
        out.print(DIGITAR_MATRICULA);
        matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
        
        
        out.print("Digite novo preço por km: ");
        pkm = Input.lerDouble("Preço por km Inválida!", "Digite novamente um novo preço por km: ");
        
        try {
            ucj.altPrecoKm(matricula, pkm);
        }
        catch (VeiculoNaoExisteException e) {
            out.println(VEICULO + e.getMessage() +  NAO_EXISTE);
        }
        catch (VeiculoNaoESeuException e2) {
            out.println(VEICULO + e2.getMessage() +  NAO_PERTENCE);
        }
    }

    private static void getListaDeAlugueres(){
        List<Aluguer> aux = ucj.getAlugueresProp(ucj.getUserNIF());

        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;

        do {
            out.print("Digite a data de inicio (dd-mm-aaaa): ");
            dataInicio = Input.lerData("Data de inicio inválida!", "Digite novamente a data de inicio (dd-mm-aaaa): ");

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_FIM_INVALIDA, "Digite novamente a data de fim (dd-mm-aaaa): ");
        }while (dataFim.before(dataInicio));

        List<Aluguer> alugs;

        alugs = filterAlugueresBD(aux, dataInicio, dataFim);

        UmCarroJaApp.clearScreen();

        if(alugs.isEmpty()) {
            out.print("Não existe alugures entre essas datas.");
        } else {
            for(Aluguer a : alugs){
                out.println(SEPARADOR);
                out.println(a.toString());
                out.println(SEPARADOR);
            }
        }
    }
    
    private static void analisarAlugueres(){
        List<Aluguer> alugs = ucj.determinarListaEspera(ucj.getUserNIF());
        boolean rep;
        UmCarroJaApp.clearScreen();
        
        for(Aluguer a : alugs) {
            a.toString();
            out.print("Digite se pretende aceitar aluguer (Sim - true, Não - false): ");
            rep = Input.lerBoolean("Resposta Inválida!", "Digite novamente uma nova resposta: ");
            
            ucj.respostaProp(rep,a);
        }
    }
    
    public static void suplementoPrecoAlug(){
        String matricula;
        String nifCliente;
        double newPrice;
        List<Aluguer> alugs = new ArrayList();
        UmCarroJaApp.clearScreen();
        
        out.print(DIGITAR_MATRICULA);
        matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
        
        
        out.print("Digite o Email do cliente: ");
        nifCliente = Input.lerString(EMAIL_INVALIDO, "Digite novamente o Email do cliente: ");
        
        
        try {
            alugs = ucj.determinarListaAlugCli(matricula, nifCliente);
        }
        catch (VeiculoNaoESeuException e) {
            out.println(VEICULO + e.getMessage() +  NAO_PERTENCE);
        }
        catch (UtilizadorNaoExisteException e2) {
            out.println("O cliente " + e2.getMessage() +  NAO_EXISTE);
        }
        
        boolean rep;
        boolean flag;
        
        if(alugs.isEmpty()){
            out.println("Não existem alugueres por por parte do cliente " + nifCliente + " no veículo com matrícula " + matricula + ".\n");
        } else {
            for(Aluguer a : alugs) {
                a.toString();
                out.print("Digite se pretende alterar preço de aluguer (Sim - true, Não - false): ");
                rep = Input.lerBoolean("Resposta Inválida!", "Digite novamente uma nova resposta: ");
                flag = true;
                while (rep && flag) {
                    out.print("Digite novo preço para aluguer: ");
                    newPrice = Input.lerDouble("Preço Inválido!", "Digite novamente um novo preço: ");
                    flag = newPrice < a.getCustoViagem();
                    if (flag) {
                        out.println("Novo preço menor do que o anterior digite novo preço novamente!");
                    } else {
                        ucj.altPrecoAluguer(newPrice, a);
                    }
                }
            }
        }
        UmCarroJaApp.guardarDados();
     }
    
    public static void calcFactBDates(){
        String matricula;
        GregorianCalendar inicio;
        GregorianCalendar fim;
        double total = 0;
        UmCarroJaApp.clearScreen();
        
        out.print(DIGITAR_MATRICULA);
        matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
         
        do {
            out.print("Digite a Data limite inferior (dd-mm-aaaa): ");
            inicio = Input.lerData("Data limite inferior Inválida!", "Digite novamente a Data limite inferior (dd-mm-aaaa): ");

            out.print("Digite a Data limite superior (dd-mm-aaaa): ");
            fim = Input.lerData("Data limite superior Inválida!", "Digite novamente a Data limite superior (dd-mm-aaaa): ");
        }while (fim.before(inicio));

        try {
            total = ucj.totalFactBDates(matricula, inicio, fim);
        }
        catch (VeiculoNaoESeuException e) {
            out.println(VEICULO + e.getMessage() +  " não está registado no seu historial de alugueres!\n");
        }
       
        StringBuilder str = new StringBuilder();
        str.append("O total facturado pelo veículo de matrícula "); str.append(matricula);
        str.append(" faturou no total: "); str.append(total);
        str.append(" euros, entre "); str.append(inicio.toString());
        str.append(" e "); str.append(fim.toString());
        str.append(".\n");
        out.println(str);
    }

    private static List<Aluguer> filterAlugueresBD (List<Aluguer> alugs, GregorianCalendar dataInicio, GregorianCalendar dataFim) {
        List<Aluguer> res = alugs.stream().filter(a -> a.getDataInicio().after(dataInicio) && a.getDataFim().before(dataFim) && a.getRealizado()).collect(Collectors.toList());

        TreeSet<Aluguer> resOrd = new TreeSet<>((a1, a2) -> {
            int i = a1.getDataInicio().compareTo(a2.getDataInicio());
            if(i == 0) {return -1; }
            return i;
        });


        for(Aluguer a : res) {
            resOrd.add(new Aluguer(a));
        }

        return resOrd.stream().collect(Collectors.toList());
    }

    /******************************************************************************
     *                         FIM DO MENU DOS PROPRIETÁRIOS                      *
     ******************************************************************************/
     
    /******************************************************************************
     *                               MENU DOS CLIENTES                            *
     ******************************************************************************/
    
    private static void sessaoCliente(){
        do{
            classificarVeiculos();
            UmCarroJaApp.clearScreen();
            menuCliente.executa();
            switch(menuCliente.getOpcao()){
                case 1: aluguerMaisProximo();
                        break;
                case 2: aluguerMaisBarato();
                        break;     
                case 3: aluguerMaisBaratoPerimetro();
                        break;
                case 4: aluguerVeiculoEspecifico();
                        break;
                case 5: aluguerDeterminadaAutonomia();
                        break;
                case 6: meusAlugueresEntreDatasCli();
                        break;
                default:
                        System.out.println(OPCAO_INVALIDA);
            }
        }while(menuCliente.getOpcao() != 0);
        ucj.logoutUtilizador();
        menuUtilizador.executa();
    }

    private static boolean verificaData (GregorianCalendar inicio, GregorianCalendar fim){
        return (inicio.equals(dataInicioApp) || inicio.after(dataInicioApp)) && (fim.equals(inicio) || fim.after(inicio));
    }

    private static void classificarVeiculos(){
        List<Aluguer> classif = ucj.alugueresClassificarVeiculo();

        boolean correto = false;
        int classificacao = 0;

        for (Aluguer alug : classif){
            out.println("--------------------- model.Aluguer ---------------------");
            out.println("Matrícula: " + alug.getMatricula());
            out.println("Data de Início do model.Aluguer: " + alug.getDataFim());
            out.println("Data de Fim do model.Aluguer: " + alug.getDataFim());
            out.println("---------------------------------------------------");
            do {
                out.print("Digite uma classificação para o veículo com a matrícula: " + alug.getMatricula() + " (0-100): ");
                classificacao = Input.lerInt("utils.Classificacao Inválida!", "Digite novamente a classificação (0-100): ");
                if (classificacao >= 0 && classificacao <= 100){
                    correto = true;
                }
            }while(!correto);
            ucj.classificarVeiculo(alug, classificacao);
        }
    }

    private static void aluguerMaisProximo(){

        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;
        int quantos;
        String matricula;
        double latitude;
        double longitude;
        boolean correto = false;

        UmCarroJaApp.clearScreen();

        do{
            out.print(DIGITAR_DATA_INICIO_ALUGUER);
            dataInicio = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_INICIO_ALUGUER_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData("Data de Fim de model.Aluguer Inválida!", DATA_FIM_ALUGUER_DENOVO);
        }while (!verificaData(dataInicio, dataFim));

        out.print(DIGITAR_LATITUDE_DESTINO);
        latitude = Input.lerDouble(LATITUDE_INVALIDA, LATITUDE_DENOVO);

        out.print("Digite  a Longitude do Destino: ");
        longitude = Input.lerDouble(LONGITUDE_INVALIDA, LONGITUDE_DENOVO);

        out.print("Digite o Número de Veículos Mais Próximos que Deseja Listar: ");
        quantos = Input.lerInt(VALOR_INVALIDO, NUMERO_VEICULOS_DENOVO);

        ParDatas newPair = new ParDatas(dataInicio, dataFim);
        Coordinate posDestino = new Coordinate(latitude,longitude);

        List<Veiculo> veiculosMaisProximo = new ArrayList<>();

        try{
            veiculosMaisProximo = ucj.maisProximo(posDestino, newPair, quantos);
        }
        catch(NaoExistemVeiculosDisponiveisException e){
            out.println("Não Existem Veículos Disponíveis para Alugar, Com os Critérios Inseridos!");
        }

        for(Veiculo v: veiculosMaisProximo){
            out.print(SEPARADOR);
            out.print(v.toString());
            out.print(SEPARADOR);
        }

        do{
            out.print(MATRICULA_A_ALUGAR);
            matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
            final String matr = matricula;
            if (veiculosMaisProximo.stream().filter(v -> v.getMatricula().equals(matr)).count() > 0){
                correto = true;
            }
        }while(!correto);
        
        Aluguer alug = new Aluguer(ucj.getEmailUser(), matricula, dataInicio, dataFim, 0.0, 0, 0, posDestino, 0, false, true, false, false, 0);

        ucj.registaAluguer(alug);
    }

    private static void aluguerMaisBarato(){
        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;
        int quantos;
        String matricula;
        double latitude;
        double longitude;
        boolean correto = false;

        do {
            out.print(DIGITAR_DATA_INICIO_ALUGUER);
            dataInicio = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_INICIO_ALUGUER_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_FIM_ALUGUER_DENOVO);
        }while (!verificaData(dataInicio, dataFim));

        out.print(DIGITAR_LATITUDE_DESTINO);
        latitude = Input.lerDouble(LATITUDE_INVALIDA, LATITUDE_DENOVO);

        out.print(DIGITAR_LONGITUDE_DESTINO);
        longitude = Input.lerDouble(LONGITUDE_INVALIDA, LONGITUDE_DENOVO);

        out.print("Quanto veiculos deseja ver: ");
        quantos = Input.lerInt(VALOR_INVALIDO, NUMERO_VEICULOS_DENOVO);

        ParDatas newPair = new ParDatas(dataInicio,dataFim);
        Coordinate posDestino = new Coordinate(latitude,longitude);

        List<Veiculo> veiculosMaisBaratos = new ArrayList<>();

        try{
            veiculosMaisBaratos = ucj.maisBarato(posDestino, newPair, quantos);
        }
        catch(NaoExistemVeiculosDisponiveisException e){
            out.println(e.getMessage());
        }

        for(Veiculo v: veiculosMaisBaratos){
            out.println(SEPARADOR);
            out.println(v.toString());
            out.println(SEPARADOR);
        }

        do{
            out.print(MATRICULA_A_ALUGAR);
            matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
            final String matr = matricula;
            if (veiculosMaisBaratos.stream().filter(v -> v.getMatricula().equals(matr)).count() > 0){
                correto = true;
            }
        }while(!correto);

        Aluguer alug = new Aluguer(ucj.getEmailUser(), matricula, dataInicio, dataFim, 0.0, 0, 0, posDestino, 0, false, true, false, false, 0);

        ucj.registaAluguer(alug);
    }


    private static void aluguerMaisBaratoPerimetro(){
        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;
        int quantos;
        String matricula;
        double latitude;
        double longitude;
        double perimetro;
        boolean correto = false;

        do {
            out.print(DIGITAR_DATA_INICIO_ALUGUER);
            dataInicio = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_INICIO_ALUGUER_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_FIM_ALUGUER_DENOVO);
        }while (!verificaData(dataInicio, dataFim));

        out.print(DIGITAR_LATITUDE_DESTINO);
        latitude = Input.lerDouble(LATITUDE_INVALIDA, LATITUDE_DENOVO);

        out.print(DIGITAR_LONGITUDE_DESTINO);
        longitude = Input.lerDouble(LONGITUDE_INVALIDA, LONGITUDE_DENOVO);

        out.print("Indique o perimetro de procura: ");
        perimetro = Input.lerDouble("Perimetro Inválido!", "Digite novamente o perimetro: ");

        out.print("Quanto veiculos deseja ver: ");
        quantos = Input.lerInt(VALOR_INVALIDO, NUMERO_VEICULOS_DENOVO);

        ParDatas newPair = new ParDatas(dataInicio,dataFim);
        Coordinate posDestino = new Coordinate(latitude,longitude);

        List<Veiculo> veiculosMaisBaratosPeri = new ArrayList<>();

        try{
            veiculosMaisBaratosPeri = ucj.maisBaratoNoPerimetro(posDestino, ucj.getPosicaoCliente(), newPair, perimetro, quantos);
        }
        catch(NaoExistemVeiculosDisponiveisException e){
            out.println(e.getMessage());
        }

        for(Veiculo v: veiculosMaisBaratosPeri){
            out.println(SEPARADOR);
            out.println(v.toString());
            out.println(SEPARADOR);
        }

        do{
            out.print(MATRICULA_A_ALUGAR);
            matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
            final String matr = matricula;
            if (veiculosMaisBaratosPeri.stream().filter(v -> v.getMatricula().equals(matr)).count() > 0){
                correto = true;
            }
        }while(!correto);

        Aluguer alug = new Aluguer(ucj.getEmailUser(), matricula, dataInicio, dataFim, 0.0, 0, 0, posDestino, 0, false, true, false, false, 0);

        ucj.registaAluguer(alug);
    }

    private static void aluguerVeiculoEspecifico(){
        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;
        String matricula;
        double latitude;
        double longitude;

        do {
            out.print(DIGITAR_DATA_INICIO_ALUGUER);
            dataInicio = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_INICIO_ALUGUER_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_FIM_ALUGUER_DENOVO);
        }while (!verificaData(dataInicio, dataFim));

        out.print("Introduza a Matrícula do veículo pretendido");
        matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);

        out.print(DIGITAR_LATITUDE_DESTINO);
        latitude = Input.lerDouble(LATITUDE_INVALIDA, LATITUDE_DENOVO);

        out.print(DIGITAR_LONGITUDE_DESTINO);
        longitude = Input.lerDouble(LONGITUDE_INVALIDA, LONGITUDE_DENOVO);

        ParDatas newPair = new ParDatas(dataInicio, dataFim);
        Coordinate posDestino = new Coordinate(latitude, longitude);

        Veiculo v;
        try{
            v = ucj.veiculoEspecifico(posDestino, newPair, matricula);
            Aluguer alug = new Aluguer(ucj.getEmailUser(), v.getMatricula(), dataInicio, dataFim, 0.0, 0, 0, posDestino, 0, false, true, false, false, 0);
            ucj.registaAluguer(alug);
        }
        catch(VeiculoNaoExisteException e){
            out.println(VEICULO + e.getMessage() +  " com a matrícula introduzida não existe. \n");
        }
        catch(VeiculoIndisponivelException e){
            out.println(VEICULO + e.getMessage() +  " não tem disponibilidade para ser alugado. \n");
        }
    }

    private static void aluguerDeterminadaAutonomia(){

        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;
        int quantos;
        String matricula;
        double latitude;
        double longitude;
        int auto1;
        int auto2;
        boolean correto = false;

        do {
            out.print(DIGITAR_DATA_INICIO_ALUGUER);
            dataInicio = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_INICIO_ALUGUER_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_INICIO_ALUGUER_INVALIDA, DATA_FIM_ALUGUER_DENOVO);
        }while(!verificaData(dataInicio, dataFim));

        out.print(DIGITAR_LATITUDE_DESTINO);
        latitude = Input.lerDouble(LATITUDE_INVALIDA, LATITUDE_DENOVO);

        out.print(DIGITAR_LONGITUDE_DESTINO);
        longitude = Input.lerDouble(LONGITUDE_INVALIDA, LONGITUDE_DENOVO);

        do {
            out.print("Indique o limite inferior de autonomia: ");
            auto1 = Input.lerInt("Limite Inválido!", "Digite novamente o limite inferior: ");

            out.print("Indique o limite superior de autonomia: ");
            auto2 = Input.lerInt("Limite Inválido!", "Digite novamente o limite superior: ");
            if (auto1 < auto2 && auto1 >= 0 && auto2 > 0){
                correto = true;
            }
        }while (!correto);

        correto = false;

        out.print("Indique quantos veiculos deseja ver: ");
        quantos = Input.lerInt(VALOR_INVALIDO, NUMERO_VEICULOS_DENOVO);

        ParDatas newPair = new ParDatas(dataInicio,dataFim);
        Coordinate posDestino = new Coordinate(latitude,longitude);

        List<Veiculo> veiculosDetAutonomia = new ArrayList<>();

        try{
            veiculosDetAutonomia = ucj.determinadaAutonomia(posDestino, newPair, auto1, auto2, quantos);
        }
        catch(NaoExistemVeiculosDisponiveisException e){
            out.println(e.getMessage());
        }

        for(Veiculo v: veiculosDetAutonomia){
            out.println(SEPARADOR);
            out.println(v.toString());
            out.println(SEPARADOR);
        }

        do{
            out.print(MATRICULA_A_ALUGAR);
            matricula = Input.lerString(MATRICULA_INVALIDA, MATRICULA_DENOVO);
            final String matr = matricula;
            if (veiculosDetAutonomia.stream().filter(v -> v.getMatricula().equals(matr)).count() > 0){
                correto = true;
            }
        }while(!correto);

        Aluguer alug = new Aluguer(ucj.getEmailUser(), matricula, dataInicio, dataFim, 0.0, 0, 0, posDestino, 0, false, true, false, false, 0);

        ucj.registaAluguer(alug);
    }

    private static void meusAlugueresEntreDatasCli() {
        List<Aluguer> alugs = new ArrayList<>();

        try {
            alugs = ucj.getAlugueresCliente(ucj.getEmailUser());
        } catch (NaoEfetuouNenhumAluguerException e) {
            out.println(e.getMessage());
        }

        GregorianCalendar dataInicio;
        GregorianCalendar dataFim;

        do {
            out.print(DIGITAR_DATA_INICIO_ALUGUER);
            dataInicio = Input.lerData(DATA_INICIO_INVALIDA, DATA_INICIO_DENOVO);

            out.print(DIGITAR_DATA_FIM_ALUGUER);
            dataFim = Input.lerData(DATA_FIM_INVALIDA, "Digite Novamente a Data de Fim (dd-mm-aaaa): ");
        } while (dataFim.before(dataInicio));

        List<Aluguer> res = filterAlugueresBD(alugs, dataInicio, dataFim);

        UmCarroJaApp.clearScreen();
        if (res.isEmpty()) {
            out.print(NAO_EXISTEM_ALUGUERES_DATAS);
        } else {
            for (Aluguer a : res) {
                out.println(SEPARADOR);
                out.println(a.toString());
                out.println(SEPARADOR);
            }
        }
    }

                                 
    /******************************************************************************
     *                            FIM DO MENU DOS CLIENTES                        *
     *****************************************************************************


    /**
     * Guarda o estado da aplicação no ficheiro de objetos e guarda a data do dia
     * de hoje.
     */
    private static void guardarDados(){
        try {
            ucj.guardarEstado(ficheiroDados, dataInicioApp);
        } catch (IOException e) {
            out.println("Erro ao gravar os dados no ficheiro " + ficheiroDados + "!");
        }
    }


    /********** PARSING *************/
    
    private static void lerDadosTXT(String fichtxt){
        BufferedReader inFile = null;
        String linha = null;
        String [] linhas = null;
       
        UmCarroJaApp.clearScreen();
        try{
            inFile = new BufferedReader(new FileReader(fichtxt));
            boolean flag = inFile.readLine().equals("Logs");
            while(!flag){
                if (inFile.readLine().equals("Logs"))
                    flag = true;
            }
            while((linha = inFile.readLine()) != null) {
                linhas = linha.split(":", 2);
                switch (linhas[0]) {
                    case "NovoProp":
                        registarProp(linhas[1]);
                        break;
                    case "NovoCliente":
                        registarCliente(linhas[1]);
                        break;
                    case "NovoCarro":
                        registarCarro(linhas[1]);
                        break;
                    case "model.Aluguer":
                        parseAluguer(linhas[1]);
                    case "Classificar":
                        parseClassificar(linhas[1]);
                    default:
                        throw new IllegalStateException("Opção desconhecida " + linhas[0]);
                }
            }
            UmCarroJaApp.guardarDados();
        }
        catch (IOException exc){
            out.println("Erro ao ler ficheiro de texto!");
        }
    }

    private static void registarCarro(String linha1) {
        try {
            Veiculo v = ParseDados.parseVeiculo(linha1);
            ucj.registarVeiculo(v);
        } catch (VeiculoJaExisteException e) {
            out.println("O veículo com a matrícula: " + e.getMessage() + " já foi inserido!");
        }
    }

    private static void registarCliente(String linha1) {
        try{
            Cliente cli = ParseDados.parseCliente(linha1);
            ucj.registarUtilizador(cli);
        } catch(UtilizadorJaExisteException e){
            out.println("O cliente com o email: " + e.getMessage() + " já se encontra registado!\n");
        }
    }

    private static void registarProp(String linha1) {
        try {
            Proprietario prop = ParseDados.parseProprietario(linha1);
            ucj.registarUtilizador(prop);
        } catch (UtilizadorJaExisteException e) {
            out.println("O proprietário com o email: " + e.getMessage() + " já se encontra registado!\n");
        }
    }


    private static void parseAluguer(String linha){
        String mail;
        double x;
        double y;
        GregorianCalendar dataInicio = new GregorianCalendar(2019,4,20);
        GregorianCalendar dataFim = new GregorianCalendar(2019,4,21);
        ParDatas datas = new ParDatas(dataInicio, dataFim);
        String [] dados = linha.split(",");
        
        mail = dados[0] + "@gmail.com";

        try {
            x = Double.parseDouble(dados[1]);
            y = Double.parseDouble(dados[2]);
        } catch(InputMismatchException exc) {
            return;
        }
        
        Coordinate cords = new Coordinate(x, y);

        Cliente cli = new Cliente();
        try {
           cli = (Cliente) ucj.getUtilizador(mail);
        } catch (UtilizadorNaoExisteException e) {
            out.println("model.Cliente não encontrado!\n");
        }

        Veiculo v = new Veiculo();

        switch (dados[3]) {
            case "Electrico":
                try {
                    switch (dados[4]) {
                        case "MaisBarato":
                            v = ucj.maisBaratoJa(cords, datas, "model.CarroEletrico");
                            break;
                        default:
                            v = ucj.maisPertoJa(new Coordinate(cords), datas, "model.CarroEletrico");
                            break;
                    }
                } catch (NaoExistemVeiculosDisponiveisException e) {
                    out.println(NAO_EXISTEM_VEICULOS);
                }
                break;
            case "Hibrido":
                try {
                    switch (dados[4]) {
                        case "MaisBarato":
                            v = ucj.maisBaratoJa(cords, datas, "model.CarroHibrido");
                            break;
                        default:
                            v = ucj.maisPertoJa(new Coordinate(cords), datas, "model.CarroHibrido");
                            break;
                    }
                } catch (NaoExistemVeiculosDisponiveisException e) {
                    out.println(NAO_EXISTEM_VEICULOS);
                }
                break;
            case "Gasolina":
                try {
                    switch (dados[4]) {
                        case "MaisBarato":
                            v = ucj.maisBaratoJa(cords, datas, "model.CarroGasolina");
                            break;
                        default:
                            v = ucj.maisPertoJa(new Coordinate(cords), datas, "model.CarroGasolina");
                            break;
                    }
                } catch (NaoExistemVeiculosDisponiveisException e) {
                    out.println(NAO_EXISTEM_VEICULOS);
                }
                break;
            default:
                throw new IllegalStateException("Opção desconhecida " + dados[3]);
        }
       double dist = v.getPosicao().getDistancia(cords);
       Coordinate posCli = new Coordinate(cli.getPosicao());
       Aluguer alug = new Aluguer(mail, v.getMatricula(), dataInicio, dataFim, v.custoViagem(dist), v.tempoAteVeiculoPeJa(posCli), v.tempoViagemCarroJa(cords), cords, dist, true, false, true, false, 3);
       ucj.registaAluguer(alug);
       ucj.alterarPosAutonomiaVeiculo(v.getMatricula(), new Coordinate(cords));
       ucj.alterarPosCliente(mail, new Coordinate(cords));
    }
    
    public static void parseClassificar(String linha){
        String [] dados = linha.split(",");
        int classificacao = 0;
        
        try {
            classificacao = Integer.parseInt(dados[1]);
        }
        catch(InputMismatchException exc){return;}
        
        if (dados[0].contains("-")){
            ucj.classificarVeiculoJa(dados[0], classificacao);
        }else{
            ucj.classificarClienteJa(dados[0] + "@gmail.com", classificacao);
        }
    }
}
