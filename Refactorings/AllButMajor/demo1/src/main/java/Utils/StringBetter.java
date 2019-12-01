package Utils;

public class StringBetter{
    private String str;

    public StringBetter(String str) {
        this.str = str;
    }

    public StringBetter repeat(int n){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n; i++)
            s.append(this.str);
        return new StringBetter(s.toString());
    }

    public StringBetter append(String strA){
        this.str += strA;
        return this;
    }

    public StringBetter red() {
        return new StringBetter("\033[31m" + this.str).RESET();

    }

    public StringBetter under(){
        return new StringBetter("\033[4m" + this.str).RESET();

    }

    private StringBetter RESET(){
        return new StringBetter(this.str + "\033[0m");
    }

    @Override
    public String toString() {
        return this.str;
    }
}
