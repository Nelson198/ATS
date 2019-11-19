(window.webpackJsonp=window.webpackJsonp||[]).push([[303],{1183:function(e,t,n){var a=n(1674);"string"==typeof a&&(a=[[e.i,a,""]]);var i={hmr:!0,transform:void 0,insertInto:void 0};n(313)(a,i);a.locals&&(e.exports=a.locals)},1672:function(e,t,n){var a=n(1673);"string"==typeof a&&(a=[[e.i,a,""]]);var i={hmr:!0,transform:void 0,insertInto:void 0};n(313)(a,i);a.locals&&(e.exports=a.locals)},1673:function(e,t,n){(e.exports=n(312)(!1)).push([e.i,".manual-project-create{max-width:700px}.manual-project-create .visibility-select-option{margin-left:0!important;margin-bottom:8px;display:flex;align-items:center;font-size:14px}.manual-project-create .visibility-details{display:block;margin:8px 0}.manual-project-create .visibility-select-wrapper{padding:8px 0 16px}.manual-project-create .button{margin-top:8px}",""])},1674:function(e,t,n){(e.exports=n(312)(!1)).push([e.i,".create-project{display:flex!important;justify-content:space-between}.create-project-repository{display:flex;align-items:center;min-width:500px;height:40px;border:1px solid #e6e6e6;padding:8px 16px;margin-bottom:8px;box-sizing:border-box;cursor:pointer;transition:all .3s ease}.create-project-repository.disabled{background-color:#ebebeb;border-color:#ddd;cursor:default}.create-project-repository.imported{cursor:default}.create-project-repository.selected{background-color:#cae3f2;border-color:#236a97}.create-project-repository:not(.imported):not(.disabled):active,.create-project-repository:not(.imported):not(.disabled):focus,.create-project-repository:not(.imported):not(.disabled):hover{border-color:#4b9fd5;box-shadow:none}.create-project-side-with-search{margin-top:32px}.create-project-side-sticky{position:-webkit-sticky;position:sticky;top:68px}.create-project-setup{display:flex;overflow:hidden;opacity:0;flex-direction:column;height:0;width:450px;margin-bottom:0;color:#fff;background-color:#0b3c62;border:none;border-radius:3px;transition:height .5s ease,opacity .4s ease-out,margin-bottom .5s ease-in}.create-project-setup.open{opacity:1;height:160px;margin-bottom:20px}.create-project-setup h2{color:#fff;font-weight:700;font-size:16px}.create-project-setup .boxed-group-inner{display:flex;flex-direction:column;flex-grow:1}.create-project-setup .button{border-color:#4c9bd6;background-color:#4c9bd6;color:#fff;transition:border-color .2s ease,box-shadow .2s ease,background-color .2s ease}.create-project-setup .button:focus,.create-project-setup .button:hover{border-color:#327bb3;background-color:#327bb3}.create-project-actions{min-width:500px;display:flex;justify-content:space-between;align-items:center;padding:8px 0 8px 16px;border-left:1px solid transparent}.create-project-actions .icon-checkbox{margin-right:8px}",""])},1786:function(e,t,n){"use strict";n.r(t);var a=n(2),i=n(343),r=n(22),o=n(325),s=n.n(o),c=n(316),l=n(850),p=n.n(l),d=n(315),u=n.n(d),h=n(5),m=n(345),g=n(548),b=n(480),j=n(565),f=n(350),y=n(319),O=n(461),v=n(620),E=n.n(v),_=n(30),k=n(427),z=n(28),x=n(853);var N=Object(z.withRouter)(class extends a.PureComponent{constructor(){super(...arguments),this.handleLinkClick=e=>{e.preventDefault(),e.stopPropagation(),Object(_.save)(k.d,Date.now().toString(10)),this.props.router.push({pathname:"/create-organization",state:{tab:this.props.autoImport?"auto":"manual"}})}}render(){const e=this.props,t=e.autoImport,n=e.onChange,i=e.organization,r=e.organizations;return a.createElement("div",{className:"form-field spacer-bottom"},a.createElement("label",{htmlFor:"select-organization"},a.createElement("span",{className:"text-middle"},a.createElement("strong",null,Object(h.translate)("onboarding.create_project.organization")),a.createElement("em",{className:"mandatory"},"*"))),a.createElement(x.a,{hideIcons:!t,onChange:n,organization:i,organizations:r}),a.createElement("a",{className:"big-spacer-left js-new-org",href:"#",onClick:this.handleLinkClick},t?Object(h.translate)("onboarding.create_project.import_new_org"):Object(h.translate)("onboarding.create_project.create_new_org")))}}),C=n(435),P=n.n(C),S=n(309),w=n(359),U=n.n(w),K=n(358),M=n.n(K),R=n(326),A=n(463),F=n(489),D=n(682),B=n(616),L=n.n(B),I=n(304),W=n(314),T=n.n(W),J=n(483),V=n.n(J),q=n(775),$=n.n(q),G=n(322),H=n(334);class Q extends a.PureComponent{constructor(){super(...arguments),this.handleMouseEnter=()=>{this.props.highlightUpgradeBox(!0)},this.handleMouseLeave=()=>{this.props.highlightUpgradeBox(!1)},this.handleToggle=()=>{this.props.disabled||this.props.repository.linkedProjectKey||this.props.toggleRepository(this.props.repository)}}render(){const e=this.props,t=e.disabled,n=e.identityProvider,i=e.repository,r=e.selected,o=Boolean(i.linkedProjectKey);return a.createElement(T.a,{overlay:t?Object(h.translate)("onboarding.create_project.subscribe_to_import_private_repositories"):void 0},a.createElement("li",null,a.createElement("div",{className:S("create-project-repository",{disabled:t,imported:o,selected:r}),onClick:this.handleToggle,onMouseEnter:t?this.handleMouseEnter:void 0,onMouseLeave:t?this.handleMouseLeave:void 0,role:"listitem"},a.createElement("div",{className:"flex-1 display-flex-center"},t?a.createElement($.a,{fill:H.colors.disableGrayText}):a.createElement(U.a,{checked:r||o,disabled:t||o,onCheck:L.a}),a.createElement("img",{alt:n.name,className:S("spacer-left",{"icon-half-transparent":t}),height:14,src:"".concat(Object(G.getBaseUrl)(),"/images/sonarcloud/").concat(n.key,".svg"),width:14}),a.createElement("span",{className:"spacer-left"},this.props.repository.label),i.private&&a.createElement("div",{className:"badge spacer-left"},Object(h.translate)("visibility.private"))),i.linkedProjectKey&&a.createElement("span",null,a.createElement(V.a,{className:"little-spacer-right",fill:H.colors.green}),a.createElement(I.FormattedMessage,{defaultMessage:Object(h.translate)("onboarding.create_project.repository_imported"),id:"onboarding.create_project.repository_imported",values:{link:a.createElement(z.Link,{to:Object(y.s)(i.linkedProjectKey)},Object(h.translate)("onboarding.create_project.see_project"))}})))))}}var Z=n(442),X=n.n(Z),Y=n(310);function ee(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=[],a=!0,i=!1,r=void 0;try{for(var o,s=e[Symbol.iterator]();!(a=(o=s.next()).done)&&(n.push(o.value),!t||n.length!==t);a=!0);}catch(e){i=!0,r=e}finally{try{a||null==s.return||s.return()}finally{if(i)throw r}}return n}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}()}class te extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={submitting:!1},this.canSubmit=()=>!this.state.submitting&&this.props.selectedRepositories.length>0,this.handleFormSubmit=e=>{if(e.preventDefault(),this.canSubmit()){const e=this.props.selectedRepositories;this.setState({submitting:!0}),Object(g.g)({installationKeys:e.map(e=>e.installationKey),organization:this.props.organization.key}).then(e=>{let t=e.projects;return this.props.onProjectCreate(t.map(e=>e.projectKey),this.props.organization.key)},this.handleProvisionFail)}},this.handleProvisionFail=()=>this.props.onProvisionFail().then(()=>{this.mounted&&this.setState({submitting:!1})})}componentDidMount(){this.mounted=!0}componentWillUnmount(){this.mounted=!1}render(){const e=this.props.selectedRepositories,t=e.length>0,n=ee(X()(e,e=>e.private),2),i=n[0],r=void 0===i?[]:i,o=n[1],s=void 0===o?[]:o;return a.createElement("form",{className:S("create-project-setup boxed-group",{open:t}),onSubmit:this.handleFormSubmit},a.createElement("div",{className:"boxed-group-header"},a.createElement("h2",{className:"spacer-top"},e.length>1?Object(h.translateWithParameters)("onboarding.create_project.x_repositories_selected",e.length):Object(h.translate)("onboarding.create_project.1_repository_selected"))),a.createElement("div",{className:"boxed-group-inner"},a.createElement("div",{className:"flex-1"},1===s.length&&a.createElement("p",null,Object(h.translate)("onboarding.create_project.1_repository_created_as_public")),s.length>1&&a.createElement("p",null,Object(h.translateWithParameters)("onboarding.create_project.x_repository_created_as_public",s.length)),1===r.length&&a.createElement("p",null,Object(h.translate)("onboarding.create_project.1_repository_created_as_private")),r.length>1&&a.createElement("p",null,Object(h.translateWithParameters)("onboarding.create_project.x_repository_created_as_private",r.length))),a.createElement("div",null,a.createElement(Y.SubmitButton,{className:"button-large",disabled:this.state.submitting},Object(h.translate)("set_up")),a.createElement(u.a,{className:"spacer-left",loading:this.state.submitting}))))}}class ne extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={checkAllRepositories:!1,highlight:!1,loading:!0,repositories:[],search:"",selectedRepositories:{},successfullyUpgraded:!1},this.fetchRepositories=()=>{const e=this.props.organization;return Object(g.e)({organization:e.key}).then(e=>{let t=e.repositories;this.mounted&&this.setState({loading:!1,repositories:t})},()=>{this.mounted&&this.setState({loading:!1})})},this.filterBySearch=e=>t=>t.label.toLowerCase().includes(e.toLowerCase()),this.handleHighlightUpgradeBox=e=>{this.setState({highlight:e})},this.handleOrganizationUpgrade=()=>{this.props.onOrganizationUpgrade(),this.mounted&&this.setState({successfullyUpgraded:!0})},this.handleProvisionFail=()=>this.fetchRepositories().then(()=>{this.mounted&&this.setState(e=>{let t=e.repositories,n=e.selectedRepositories;const a={};return Object.keys(n).forEach(e=>{const n=t.find(t=>t.installationKey===e);n&&!n.linkedProjectKey&&(a[n.installationKey]=n)}),{selectedRepositories:a}})}),this.handleSearch=e=>{this.setState({search:e,checkAllRepositories:!1,selectedRepositories:{}})},this.onCheckAllRepositories=()=>{this.setState(e=>{let t=e.checkAllRepositories,n=e.repositories,a=e.search;const i=this.props.organization,r=Object(F.c)(i),o={selectedRepositories:{},checkAllRepositories:!t};if(o.checkAllRepositories){const e=n.filter(e=>this.filterBySearch(a)(e)&&(e=>!!r||!e.private)(e)&&(e=>!e.linkedProjectKey)(e));o.selectedRepositories=P()(e,"installationKey")}return o})},this.toggleRepository=e=>{this.setState(t=>{let n=t.selectedRepositories;return{selectedRepositories:Object.assign({},n,{[e.installationKey]:n[e.installationKey]?void 0:e})}})}}componentDidMount(){this.mounted=!0,this.fetchRepositories()}componentDidUpdate(e){e.organization.key!==this.props.organization.key&&(this.setState({loading:!0,selectedRepositories:{}}),this.fetchRepositories())}componentWillUnmount(){this.mounted=!1}render(){const e=this.state,t=e.highlight,n=e.loading,i=e.repositories,r=e.search,o=e.selectedRepositories,s=this.props,c=s.almApplication,l=s.organization,p=Object(F.c)(l),d=i.some(e=>Boolean(e.private)),m=i.length>5,g=i.length>1,b=!p&&d&&l.actions&&l.actions.admin,j=i.filter(this.filterBySearch(r));return a.createElement("div",{className:"create-project"},a.createElement("div",{className:"flex-1 huge-spacer-right"},a.createElement("div",{className:"spacer-bottom create-project-actions"},a.createElement("div",null,g&&a.createElement(U.a,{checked:this.state.checkAllRepositories,disabled:0===j.length,onCheck:this.onCheckAllRepositories},Object(h.translate)("onboarding.create_project.select_all_repositories"))),m&&a.createElement(M.a,{minLength:1,onChange:this.handleSearch,placeholder:Object(h.translate)("search.search_for_repositories"),value:this.state.search})),this.state.successfullyUpgraded&&a.createElement(R.Alert,{variant:"success"},Object(h.translateWithParameters)("onboarding.create_project.subscribtion_success_x",l.name)),a.createElement(u.a,{loading:n},a.createElement("ul",null,0===j.length&&a.createElement("li",{className:"big-spacer-top note"},b?Object(h.translateWithParameters)("no_results_for_x",r):Object(h.translate)("onboarding.create_project.no_repositories")),j.map(e=>a.createElement(Q,{disabled:Boolean(e.private&&!p),highlightUpgradeBox:this.handleHighlightUpgradeBox,identityProvider:c,key:e.installationKey,repository:e,selected:Boolean(o[e.installationKey]),toggleRepository:this.toggleRepository}))))),l&&a.createElement("div",{className:S({"create-project-side-with-search":m})},a.createElement("div",{className:"create-project-side-sticky"},a.createElement(te,{onProjectCreate:this.props.onProjectCreate,onProvisionFail:this.handleProvisionFail,organization:l,selectedRepositories:Object.keys(o).map(e=>o[e]).filter(A.isDefined)}),b&&a.createElement(D.a,{className:S({highlight:t}),onOrganizationUpgrade:this.handleOrganizationUpgrade,organization:l}))))}}class ae extends a.PureComponent{constructor(e){super(e),this.mounted=!1,this.handleInstallAppClick=()=>{Object(_.save)(k.c,Date.now().toString(10)),Object(_.save)(k.d,Date.now().toString(10))},this.handleOrganizationSelect=e=>{let t=e.key;this.setState({selectedOrganization:t})},this.state={selectedOrganization:this.getInitialSelectedOrganization(e)}}componentDidMount(){this.mounted=!0}componentWillUnmount(){this.mounted=!1}getInitialSelectedOrganization(e){return e.organization?e.organization:1===e.boundOrganizations.length?e.boundOrganizations[0].key:""}render(){const e=this.props,t=e.almApplication,n=e.boundOrganizations,i=e.onProjectCreate;if(0===n.length)return a.createElement(a.Fragment,null,a.createElement("p",{className:"spacer-bottom"},Object(h.translate)("onboarding.create_project.install_app_description",t.key)),a.createElement(E.a,{backgroundColor:t.backgroundColor,className:"display-inline-block",iconPath:t.iconPath,name:t.name,onClick:this.handleInstallAppClick,small:!0,url:t.installationUrl},Object(h.translate)("onboarding.import_organization.choose_organization_button",t.key)));const r=this.state.selectedOrganization,o=n.find(e=>e.key===r);return a.createElement(a.Fragment,null,a.createElement(N,{autoImport:!0,onChange:this.handleOrganizationSelect,organization:r,organizations:this.props.boundOrganizations}),o&&a.createElement(ne,{almApplication:t,onOrganizationUpgrade:this.props.onOrganizationUpgrade,onProjectCreate:i,organization:o}))}}var ie=n(362),re=n.n(ie),oe=n(567),se=n.n(oe),ce=n(357),le=n(733);n(1672);class pe extends a.PureComponent{constructor(e){super(e),this.mounted=!1,this.checkFreeKey=e=>Object(ce.f)({component:e}).then(t=>{this.mounted&&e===this.state.projectKey&&(t?this.setState({projectKeyError:Object(h.translate)("onboarding.create_project.project_key.taken"),touched:!0,validating:!1}):this.setState({projectKeyError:void 0,validating:!1}))}).catch(()=>{this.mounted&&e===this.state.projectKey&&this.setState({projectKeyError:void 0,validating:!1})}),this.canChoosePrivate=e=>Boolean(e&&"PAID"===e.subscription),this.getInitialSelectedOrganization=e=>e.organization?this.getOrganization(e.organization):e.userOrganizations&&1===e.userOrganizations.length?e.userOrganizations[0]:void 0,this.getOrganization=e=>this.props.userOrganizations&&this.props.userOrganizations.find(t=>{return t.key===e}),this.handleFormSubmit=e=>{e.preventDefault();const t=this.state;this.canSubmit(t)&&(this.setState({submitting:!0}),Object(ce.c)({project:t.projectKey,name:(t.projectName||t.projectKey).trim(),organization:t.selectedOrganization&&t.selectedOrganization.key,visibility:this.state.selectedVisibility}).then(e=>{let t=e.project;return this.props.onProjectCreate([t.key])},()=>{this.mounted&&this.setState({submitting:!1})}))},this.handleOrganizationSelect=e=>{let t=e.key;const n=this.getOrganization(t);let a=this.state.selectedVisibility;void 0===a&&(a=this.canChoosePrivate(n)?"private":"public"),this.setState({selectedOrganization:n,selectedVisibility:a})},this.handleOrganizationUpgrade=()=>{this.props.fetchMyOrganizations().then(()=>{this.setState(e=>{if(e.selectedOrganization){return{selectedOrganization:this.getOrganization(e.selectedOrganization.key)}}return null})},()=>{})},this.handleProjectKeyChange=e=>{const t=e.currentTarget.value||"",n=this.validateKey(t);this.setState(e=>{const a=e.projectNameChanged?e.projectName:t;return{projectKey:t,projectKeyError:n,projectName:a,projectNameError:this.validateName(a),touched:!0,validating:void 0===n}}),void 0===n&&this.checkFreeKey(t)},this.handleProjectNameChange=e=>{const t=e.currentTarget.value;this.setState({projectName:t,projectNameChanged:!0,projectNameError:this.validateName(t)})},this.handleVisibilityChange=e=>{this.setState({selectedVisibility:e})},this.validateKey=e=>e.length>400||!/^[\w-.:]*[a-zA-Z]+[\w-.:]*$/.test(e)?Object(h.translate)("onboarding.create_project.project_key.error"):void 0,this.validateName=e=>0===e.length||e.length>255?Object(h.translate)("onboarding.create_project.display_name.error"):void 0,this.state={projectKey:"",projectName:"",projectNameChanged:!1,selectedOrganization:this.getInitialSelectedOrganization(e),submitting:!1,touched:!1,validating:!1},this.checkFreeKey=re()(this.checkFreeKey,250)}componentDidMount(){this.mounted=!0}componentWillUnmount(){this.mounted=!1}canSubmit(e){const t=e.projectKey,n=e.projectKeyError,a=e.projectName,i=e.projectNameError,o=e.selectedOrganization;return Boolean(void 0===n&&void 0===i&&t.length>0&&a.length>0&&(!Object(r.isSonarCloud)()||o))}render(){const e=this.state,t=e.projectKey,n=e.projectKeyError,i=e.projectName,o=e.projectNameError,s=e.selectedOrganization,c=e.submitting,l=e.touched,p=e.validating,d=l&&void 0!==n,m=l&&!p&&void 0===n,g=l&&void 0!==o,b=l&&void 0===o,j=this.canChoosePrivate(s);return a.createElement("div",{className:"create-project"},a.createElement("div",{className:"flex-1 huge-spacer-right"},a.createElement("form",{className:"manual-project-create",onSubmit:this.handleFormSubmit},Object(r.isSonarCloud)()&&this.props.userOrganizations&&a.createElement(N,{onChange:this.handleOrganizationSelect,organization:s?s.key:"",organizations:this.props.userOrganizations}),a.createElement(se.a,{className:"form-field",description:Object(h.translate)("onboarding.create_project.project_key.description"),error:n,help:Object(h.translate)("onboarding.create_project.project_key.help"),id:"project-key",isInvalid:d,isValid:m,label:Object(h.translate)("onboarding.create_project.project_key"),required:!0},a.createElement("input",{autoFocus:!0,className:S("input-super-large",{"is-invalid":d,"is-valid":m}),id:"project-key",maxLength:400,minLength:1,onChange:this.handleProjectKeyChange,type:"text",value:t})),a.createElement(se.a,{className:"form-field",description:Object(h.translate)("onboarding.create_project.display_name.description"),error:o,help:Object(h.translate)("onboarding.create_project.display_name.help"),id:"project-name",isInvalid:g,isValid:b,label:Object(h.translate)("onboarding.create_project.display_name"),required:!0},a.createElement("input",{className:S("input-super-large",{"is-invalid":g,"is-valid":b}),id:"project-name",maxLength:255,minLength:1,onChange:this.handleProjectNameChange,type:"text",value:i})),Object(r.isSonarCloud)()&&s&&a.createElement("div",{className:S("visibility-select-wrapper",{open:Boolean(this.state.selectedOrganization)})},a.createElement(le.a,{canTurnToPrivate:j,onChange:this.handleVisibilityChange,showDetails:!0,visibility:j?this.state.selectedVisibility:"public"})),a.createElement(Y.SubmitButton,{disabled:!this.canSubmit(this.state)||c},Object(h.translate)("set_up")),a.createElement(u.a,{className:"spacer-left",loading:c}))),Object(r.isSonarCloud)()&&s&&a.createElement("div",{className:"create-project-side-sticky"},a.createElement(D.a,{className:S("animated",{open:!j}),onOrganizationUpgrade:this.handleOrganizationUpgrade,organization:s})))}}n(1183);const de={skipOnboarding:O.g};var ue=Object(b.a)(Object(j.a)(Object(c.connect)(null,de)(class extends a.PureComponent{constructor(){var e;super(...arguments),e=this,this.mounted=!1,this.state={loading:!0},this.handleProjectCreate=(e,t)=>{this.props.skipOnboarding(),e.length>1?this.props.router.push({pathname:(t?Object(y.p)(t):"")+"/projects"}):1===e.length&&this.props.router.push(Object(y.s)(e[0]))},this.fetchAlmApplication=()=>Object(g.b)().then(e=>{let t=e.application;this.mounted&&this.setState({almApplication:t,loading:!1})},()=>{this.mounted&&this.setState({loading:!1})}),this.onTabChange=e=>{this.updateUrl({tab:e})},this.updateUrl=function(){let t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};e.props.router.replace({pathname:e.props.location.pathname,query:e.props.location.query,state:Object.assign({},e.props.location.state||{},t)})}}componentDidMount(){this.mounted=!0,Object(f.c)(this.props.currentUser)?this.fetchAlmApplication():this.setState({loading:!1}),Object(m.addWhitePageClass)()}componentWillUnmount(){this.mounted=!1,Object(m.removeWhitePageClass)()}render(){const e=this.props,t=e.currentUser,n=e.location,i=e.userOrganizations,r=this.state,o=r.almApplication,c=r.loading,l=n.state||{},d=Object(h.translate)("onboarding.create_project.header"),m="manual"===l.tab;return a.createElement(a.Fragment,null,a.createElement(s.a,{title:d,titleTemplate:"%s"}),a.createElement("div",{className:"page page-limited huge-spacer-top huge-spacer-bottom"},a.createElement("header",{className:"page-header huge-spacer-bottom"},a.createElement("h1",{className:"page-title huge"},a.createElement("strong",null,d))),c?a.createElement(u.a,null):a.createElement(a.Fragment,null,o&&a.createElement(p.a,{onChange:this.onTabChange,selected:l.tab||"auto",tabs:[{key:"auto",node:Object(h.translate)("onboarding.create_project.select_repositories")},{key:"manual",node:Object(h.translate)("onboarding.create_project.setup_manually")}]}),m||!o?a.createElement(pe,{currentUser:t,fetchMyOrganizations:this.props.fetchMyOrganizations,onProjectCreate:this.handleProjectCreate,organization:l.organization,userOrganizations:i.filter(e=>{let t=e.actions;return(void 0===t?{}:t).provision})}):a.createElement(ae,{almApplication:o,boundOrganizations:i.filter(e=>{let t=e.alm,n=e.actions;return t&&(void 0===n?{}:n).provision}),onOrganizationUpgrade:this.props.fetchMyOrganizations,onProjectCreate:this.handleProjectCreate,organization:l.organization}))))}})));var he=Object(b.a)(class extends a.PureComponent{constructor(){super(...arguments),this.handleProjectCreate=e=>{1===e.length&&this.props.router.push(Object(y.s)(e[0]))}}componentDidMount(){Object(m.addWhitePageClass)()}componentWillUnmount(){Object(m.removeWhitePageClass)()}render(){const e=this.props.currentUser,t=Object(h.translate)("my_account.create_new.TRK");return a.createElement(a.Fragment,null,a.createElement(s.a,{title:t,titleTemplate:"%s"}),a.createElement("div",{className:"page page-limited huge-spacer-top huge-spacer-bottom"},a.createElement("header",{className:"page-header bordered-bottom big-spacer-bottom"},a.createElement("h1",{className:"page-title huge big-spacer-bottom"},a.createElement("strong",null,t))),a.createElement(pe,{currentUser:e,onProjectCreate:this.handleProjectCreate})))}});function me(e){return a.createElement(a.Fragment,null,a.createElement(i.a,{anchor:"create_project_main"}),Object(r.isSonarCloud)()?a.createElement(ue,Object.assign({},e)):a.createElement(he,Object.assign({},e)))}n.d(t,"default",function(){return me})},343:function(e,t,n){"use strict";n.d(t,"a",function(){return o});var a=n(2),i=n(5),r=n(399);function o(e){return a.createElement(r.a.Consumer,null,t=>{let n=t.addA11ySkipLink,i=t.removeA11ySkipLink;return a.createElement(s,Object.assign({addA11ySkipLink:n,removeA11ySkipLink:i},e))})}class s extends a.PureComponent{constructor(){super(...arguments),this.getLink=()=>{const e=this.props,t=e.anchor,n=e.label;return{key:t,label:void 0===n?Object(i.translate)("skip_to_content"):n,weight:e.weight}}}componentDidMount(){this.props.addA11ySkipLink(this.getLink())}componentWillUnmount(){this.props.removeA11ySkipLink(this.getLink())}render(){const e=this.props.anchor;return a.createElement("span",{id:"a11y_target__".concat(e)})}}},350:function(e,t,n){"use strict";n.d(t,"a",function(){return i}),n.d(t,"b",function(){return r}),n.d(t,"c",function(){return o}),n.d(t,"d",function(){return s}),n.d(t,"e",function(){return c}),n.d(t,"f",function(){return l}),n.d(t,"g",function(){return p});var a=n(329);function i(e,t){return t.endsWith("/")||(t+="/"),c(e)?t.replace("github.com/","github.com/orgs/")+"people":t+"profile/members"}function r(e){return Object(a.b)(e)&&e.externalProvider?p(e.externalProvider):void 0}function o(e){return Object(a.b)(e)&&(s(e.externalProvider)||c(e.externalProvider))}function s(e){return!!e&&e.startsWith("bitbucket")}function c(e){return"github"===e}function l(e){return"microsoft"===e}function p(e){return s(e)?"bitbucket":e}},383:function(e,t,n){"use strict";n.d(t,"b",function(){return o}),n.d(t,"a",function(){return s});var a=n(322),i=n(14);let r=!1;function o(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"body";return new Promise(n=>{const i=document.createElement("script");i.src="".concat(Object(a.getBaseUrl)()).concat(e),i.onload=n,document.getElementsByTagName(t)[0].appendChild(i)})}async function s(e){const t=Object(i.a)(e);if(t)return Promise.resolve(t);if(!r){(0,(await Promise.all([n.e(0),n.e(1),n.e(2),n.e(4),n.e(281)]).then(n.bind(null,507))).default)(),r=!0}await o("/static/".concat(e,".js"));const a=Object(i.a)(e);return a||Promise.reject()}},427:function(e,t,n){"use strict";n.d(t,"c",function(){return p}),n.d(t,"d",function(){return d}),n.d(t,"a",function(){return u}),n.d(t,"b",function(){return h}),n.d(t,"e",function(){return m}),n.d(t,"f",function(){return g}),n.d(t,"g",function(){return b}),n.d(t,"h",function(){return j});var a=n(497),i=n.n(a),r=n(5),o=n(318),s=n(410),c=n(512),l=n(350);const p="sonarcloud.import_org.binding_in_progress",d="sonarcloud.import_org.redirect_to_projects",u="sonarcloud.bind_org.key",h="sonarcloud.bind_org.redirect_to_org";var m;function g(e,t){const n=Object(o.formatMeasure)(e,"FLOAT").replace(/[.|,]0$/,"").replace(/([.|,]\d)$/,"$10");return t?n:Object(r.translateWithParameters)("billing.price_format",n)}!function(e){e[e.OrganizationDetails=0]="OrganizationDetails",e[e.Plan=1]="Plan"}(m||(m={}));const b=i()(function(){let e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},t=void 0,n=void 0;if(e.installation_id)n="github",t=Object(s.parseAsOptionalString)(e.installation_id);else if(e.clientKey)n="bitbucket",t=Object(s.parseAsOptionalString)(e.clientKey);else if(e.jwt){const a=Object(c.decodeJwt)(e.jwt);a&&a.iss&&(n="bitbucket",t=a.iss)}return{almInstallId:t,almKey:n}}),j=e=>Object(s.cleanQuery)({installation_id:Object(l.e)(e.almKey)?Object(s.serializeString)(e.almInstallId):void 0,clientKey:Object(l.d)(e.almKey)?Object(s.serializeString)(e.almInstallId):void 0})},480:function(e,t,n){"use strict";n.d(t,"a",function(){return l});var a=n(2),i=n(31),r=n.n(i),o=n(329),s=n(393),c=n(438);function l(e){class t extends a.Component{componentDidMount(){Object(o.b)(this.props.currentUser)||r()()}render(){return Object(o.b)(this.props.currentUser)?a.createElement(e,Object.assign({},this.props)):null}}return t.displayName=Object(s.a)(e,"whenLoggedIn"),Object(c.a)(t)}},489:function(e,t,n){"use strict";n.d(t,"c",function(){return i}),n.d(t,"a",function(){return r}),n.d(t,"b",function(){return o});var a=n(329);function i(e){return Boolean(e&&"PAID"===e.subscription)}function r(e,t,n){return!i(t)||o(e,t,n)}function o(e,t,n){return Boolean(t&&Object(a.b)(e)&&(t.actions&&t.actions.admin||n.some(e=>e.key===t.key)))}},548:function(e,t,n){"use strict";n.d(t,"a",function(){return r}),n.d(t,"b",function(){return o}),n.d(t,"c",function(){return s}),n.d(t,"e",function(){return c}),n.d(t,"f",function(){return l}),n.d(t,"g",function(){return p}),n.d(t,"d",function(){return d});var a=n(8),i=n(320);function r(e){return Object(a.post)("/api/alm_integration/bind_organization",e).catch(i.a)}function o(){return Object(a.getJSON)("/api/alm_integration/show_app_info").catch(i.a)}function s(e){return Object(a.requestTryAndRepeatUntil)(()=>Object(a.getJSON)("/api/alm_integration/show_organization",e),{max:25,slowThreshold:20},()=>!0,[404]).catch(i.a).then(e=>{let t=e.almOrganization,n=e.boundOrganization;return{almOrganization:Object.assign({},t,{name:t.name||t.key}),boundOrganization:n}})}function c(e){return Object(a.getJSON)("/api/alm_integration/list_repositories",e).catch(i.a)}function l(){return Object(a.getJSON)("/api/alm_integration/list_unbound_applications").then(e=>{return e.applications.map(e=>Object.assign({},e,{name:e.name||e.key}))},i.a)}function p(e){return Object(a.postJSON)("/api/alm_integration/provision_projects",Object.assign({},e,{installationKeys:e.installationKeys.join(",")})).catch(i.a)}function d(e){const t=e.replace("https://github.com/","https://api.github.com/repos/");return Object(a.getCorsJSON)("".concat(t,"/languages"))}},552:function(e,t,n){"use strict";n.d(t,"a",function(){return l});var a=n(2),i=n(483),r=n.n(i),o=n(5),s=n(334);const c=14;function l(){return a.createElement("ul",{className:"note"},a.createElement(p,null,Object(o.translate)("billing.upgrade_box.unlimited_private_projects")),a.createElement(p,null,Object(o.translate)("billing.upgrade_box.strict_control_private_data")),a.createElement(p,null,Object(o.translate)("billing.upgrade_box.cancel_anytime")),a.createElement(p,null,a.createElement("strong",null,Object(o.translateWithParameters)("billing.upgrade_box.free_trial_x",c))))}function p(e){let t=e.children;return a.createElement("li",{className:"display-flex-center little-spacer-bottom"},a.createElement(r.a,{className:"spacer-right",fill:s.colors.lightGreen}),t)}},564:function(e,t,n){"use strict";n.d(t,"a",function(){return r}),n.d(t,"b",function(){return o});var a=n(8),i=n(320);function r(){return Object(a.getJSON)("/api/billing/show_subscription_plans").then(e=>{return e.subscriptionPlans},i.a)}function o(e){return Object(a.post)("/api/billing/send_feedback",e)}},565:function(e,t,n){"use strict";n.d(t,"a",function(){return c});var a=n(2),i=n(316),r=n(617),o=n(317),s=n(393);function c(e){class t extends a.Component{componentDidMount(){this.props.fetchMyOrganizations()}render(){return a.createElement(e,Object.assign({},this.props))}}t.displayName=Object(s.a)(e,"withUserOrganizations");const n={fetchMyOrganizations:r.b};return Object(i.connect)(function(e){return{userOrganizations:Object(o.getMyOrganizations)(e)}},n)(t)}},619:function(e,t,n){"use strict";n.d(t,"a",function(){return i});var a=n(2);class i extends a.Component{render(){const e=window.SonarBilling.BillingForm;return a.createElement(e,Object.assign({},this.props))}}},682:function(e,t,n){"use strict";var a=n(2),i=n(304),r=n(28),o=n(310),s=n(426),c=n.n(s),l=n(5),p=n(564),d=n(427),u=n(552),h=n(327),m=n.n(h),g=n(315),b=n.n(g),j=n(438),f=n(383),y=n(619);const O=Object(j.a)(y.a);class v extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={ready:!1}}componentDidMount(){this.mounted=!0,Object(f.a)("billing/billing").then(()=>{this.mounted&&this.setState({ready:!0})},()=>{})}componentWillUnmount(){this.mounted=!1}render(){const e=Object(l.translate)("billing.upgrade_box.upgrade_to_paid_plan");return this.state.ready?a.createElement(m.a,{contentLabel:e,noBackdrop:this.props.insideModal,onRequestClose:this.props.onClose,shouldCloseOnOverlayClick:!1,size:"medium"},a.createElement("div",{className:"modal-head"},a.createElement("h2",null,e)),a.createElement(O,{onCommit:this.props.onUpgradeDone,organizationKey:this.props.organization.key,subscriptionPlans:this.props.subscriptionPlans},e=>{let t=e.onSubmit,n=e.processingUpgrade,r=e.renderFormFields,s=e.renderNextCharge,c=e.renderRecap,p=e.renderSubmitButton;return a.createElement("form",{id:"organization-paid-plan-form",onSubmit:t},a.createElement("div",{className:"modal-body modal-container"},a.createElement("div",{className:"huge-spacer-bottom"},a.createElement("p",{className:"spacer-bottom"},a.createElement(i.FormattedMessage,{defaultMessage:Object(l.translate)("billing.upgrade.org_x_advantages"),id:"billing.coupon.description",values:{org:a.createElement("strong",null,this.props.organization.name)}})),a.createElement(u.a,null)),r(),a.createElement("div",{className:"big-spacer-top"},c())),a.createElement("footer",{className:"modal-foot display-flex-center display-flex-space-between"},s()||a.createElement("span",null),a.createElement("div",null,a.createElement(b.a,{loading:n}),p(),a.createElement(o.ResetButtonLink,{onClick:this.props.onClose},Object(l.translate)("cancel")))))})):null}}n.d(t,"a",function(){return E});class E extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={subscriptionPlans:[],upgradeOrganizationModal:!1},this.fetchSubscriptionPlans=()=>Object(p.a)().then(e=>{this.mounted&&this.setState({subscriptionPlans:e})}),this.handleUpgradeClick=()=>{this.setState({upgradeOrganizationModal:!0})},this.handleUpgradeOrganizationModalClose=()=>{this.mounted&&this.setState({upgradeOrganizationModal:!1})},this.handleOrganizationUpgrade=()=>{this.props.onOrganizationUpgrade(),this.handleUpgradeOrganizationModalClose()}}componentDidMount(){this.mounted=!0,this.fetchSubscriptionPlans()}componentWillUnmount(){this.mounted=!1}render(){if(!Object(l.hasMessage)("billing.upgrade_box.header"))return null;const e=this.state,t=e.subscriptionPlans,n=e.upgradeOrganizationModal,s=t[0]&&t[0].price;return a.createElement(a.Fragment,null,a.createElement(c.a,{className:this.props.className,title:Object(l.translate)("billing.upgrade_box.header"),titleInfo:void 0!==s&&a.createElement(i.FormattedMessage,{defaultMessage:Object(l.translate)("billing.price_from_x"),id:"billing.price_from_x",values:{price:a.createElement("span",{className:"big"},Object(d.f)(s))}})},a.createElement(a.Fragment,null,a.createElement(u.a,null),a.createElement("div",{className:"big-spacer-left"},a.createElement(o.Button,{className:"js-upgrade-organization",onClick:this.handleUpgradeClick},Object(l.translate)("billing.paid_plan.upgrade")),a.createElement(r.Link,{className:"spacer-left",target:"_blank",to:"/about/pricing"},Object(l.translate)("billing.pricing.learn_more"))))),n&&a.createElement(v,{insideModal:this.props.insideModal,onClose:this.handleUpgradeOrganizationModalClose,onUpgradeDone:this.handleOrganizationUpgrade,organization:this.props.organization,subscriptionPlans:t}))}}},733:function(e,t,n){"use strict";n.d(t,"a",function(){return o});var a=n(309),i=n(2),r=n(5);class o extends i.PureComponent{constructor(){super(...arguments),this.handlePublicClick=e=>{e.preventDefault(),e.currentTarget.blur(),this.props.onChange("public")},this.handlePrivateClick=e=>{e.preventDefault(),e.currentTarget.blur(),this.props.onChange("private")}}render(){return i.createElement("div",{className:a("visibility-select",this.props.className)},i.createElement("a",{className:"link-base-color link-no-underline visibility-select-option",href:"#",id:"visibility-public",onClick:this.handlePublicClick},i.createElement("i",{className:a("icon-radio",{"is-checked":"public"===this.props.visibility})}),i.createElement("span",{className:"spacer-left"},Object(r.translate)("visibility.public"))),this.props.showDetails&&i.createElement("span",{className:"visibility-details note"},Object(r.translate)("visibility.public.description.long")),this.props.canTurnToPrivate?i.createElement(i.Fragment,null,i.createElement("a",{className:"link-base-color link-no-underline huge-spacer-left visibility-select-option",href:"#",id:"visibility-private",onClick:this.handlePrivateClick},i.createElement("i",{className:a("icon-radio",{"is-checked":"private"===this.props.visibility})}),i.createElement("span",{className:"spacer-left"},Object(r.translate)("visibility.private"))),this.props.showDetails&&i.createElement("span",{className:"visibility-details note"},Object(r.translate)("visibility.private.description.long"))):i.createElement(i.Fragment,null,i.createElement("span",{className:"huge-spacer-left text-muted cursor-not-allowed visibility-select-option",id:"visibility-private"},i.createElement("i",{className:a("icon-radio",{"is-checked":"private"===this.props.visibility})}),i.createElement("span",{className:"spacer-left"},Object(r.translate)("visibility.private"))),this.props.showDetails&&i.createElement("span",{className:"visibility-details note"},Object(r.translate)("visibility.private.description.long"))))}}},853:function(e,t,n){"use strict";n.d(t,"a",function(){return d});var a=n(324),i=n.n(a),r=n(2),o=n(338),s=n.n(o),c=n(5),l=n(322),p=n(350);function d(e){let t=e.hideIcons,n=e.onChange,a=e.organization,o=e.organizations;const d=function(e){return function(t){const n=t.alm?"sonarcloud/".concat(Object(p.g)(t.alm.key)):"sonarcloud-square-logo",a="PAID"===t.subscription;return r.createElement("div",{className:"display-flex-space-between"},r.createElement("span",{className:"text-ellipsis flex-1"},!e&&r.createElement("img",{alt:t.alm?t.alm.key:"SonarCloud",className:"little-spacer-right",height:14,src:"".concat(Object(l.getBaseUrl)(),"/images/").concat(n,".svg")}),t.name,r.createElement("span",{className:"note little-spacer-left"},t.key)),a&&r.createElement("div",{className:"badge"},Object(c.translate)("organization.paid_plan.badge")))}}(t);return r.createElement(s.a,{autoFocus:!a,className:"input-super-large",clearable:!1,id:"select-organization",labelKey:"name",onChange:n,optionRenderer:d,options:i()(o,e=>e.name.toLowerCase()),placeholder:Object(c.translate)("onboarding.import_organization.choose_organization"),required:!0,value:a,valueKey:"key",valueRenderer:d})}}}]);
//# sourceMappingURL=303.m.0ce91152.chunk.js.map