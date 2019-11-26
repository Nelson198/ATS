(window.webpackJsonp=window.webpackJsonp||[]).push([[329],{1278:function(e,t,n){"use strict";n.r(t),t.default="Projects assigned to a profile will always be analyzed with it for that language, regardless of which profile is the default. Quality Profile administrators may assign projects to a profile. Project administrators may also choose a non-default profile for each language.\n"},1975:function(e,t,n){var r=n(1976),a=n(1440)(function(e,t){return null==e?{}:r(e,t)});e.exports=a},1976:function(e,t,n){var r=n(1444),a=n(1435);e.exports=function(e,t){return r(e,t,function(t,n){return a(e,n)})}},1977:function(e,t,n){"use strict";n.r(t),t.default="For each language there is a default profile. All projects not explicitly assigned to some other profile will be analyzed with the default.\n"},2114:function(e,t,n){"use strict";n.r(t);var r,a=n(12),o=n(655),l=n.n(o),i=n(159),s=n(34),c=n(649),u=n(1009),p=(r=function(e,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}r(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)}),m=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.getDeprecatedRulesInheritanceChain=function(e,n){var r=[],a=e.activeDeprecatedRuleCount;if(0===a)return r;if(e.parentKey){var o=n.find(function(t){return t.key===e.parentKey});if(o){var l=t.getDeprecatedRulesInheritanceChain(o,n);l.length&&(a-=l.reduce(function(e,t){return e+t.count},0),r=r.concat(l))}}return a>0&&r.push({count:a,from:e}),r},t.renderInheritedInfo=function(e,n){var r=t.getDeprecatedRulesInheritanceChain(e,n);return r.length?a.createElement(a.Fragment,null,r.map(function(t){return t.from.key===e.key?null:a.createElement("div",{className:"muted",key:t.from.key}," ",Object(s.translateWithParameters)("coding_rules.filters.inheritance.x_inherited_from_y",t.count,t.from.name))})):null},t}return p(t,e),t.prototype.render=function(){var e=this,t=this.props.profiles.filter(function(e){return e.activeDeprecatedRuleCount>0});if(0===t.length)return null;var n=l()(t,function(e){return-e.activeDeprecatedRuleCount});return a.createElement("div",{className:"boxed-group boxed-group-inner quality-profiles-evolution-deprecated"},a.createElement("div",{className:"spacer-bottom"},a.createElement("strong",null,Object(s.translate)("quality_profiles.deprecated_rules"))),a.createElement("div",{className:"spacer-bottom"},Object(s.translateWithParameters)("quality_profiles.deprecated_rules_are_still_activated",t.length)),a.createElement("ul",null,n.map(function(n){return a.createElement("li",{className:"spacer-top",key:n.key},a.createElement("div",{className:"text-ellipsis"},a.createElement(u.a,{className:"link-no-underline",language:n.language,name:n.name,organization:e.props.organization},n.name)),a.createElement("div",{className:"note"},n.languageName,", ",a.createElement(i.Link,{className:"text-muted",to:Object(c.i)({qprofile:n.key},e.props.organization)},Object(s.translateWithParameters)("quality_profile.x_rules",n.activeDeprecatedRuleCount)),e.renderInheritedInfo(n,t)))})))},t}(a.PureComponent),f=n(160),d=n(648),h=n(725),g=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),y=function(){return(y=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var a in t=arguments[n])Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a]);return e}).apply(this,arguments)};function b(e,t){return e.map(function(e){var n=t&&t[e.key];return y({},e,{activations:n?n.length:0})})}var v=function(e){function t(t){var n=e.call(this,t)||this;n.mounted=!1,n.state={};var r=new Date;return r.setFullYear(r.getFullYear()-1),n.periodStartDate=Object(f.toShortNotSoISOString)(r),n}return g(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.loadLatestRules()},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.loadLatestRules=function(){var e=this,t={asc:!1,available_since:this.periodStartDate,f:"name,langName,actives",organization:this.props.organization||void 0,ps:10,s:"createdAt"};Object(h.f)(t).then(function(t){var n=t.actives,r=t.rules,a=t.total;e.mounted&&e.setState({latestRules:l()(b(r,n),"langName"),latestRulesTotal:a})},function(){})},t.prototype.render=function(){var e=this;if(!this.state.latestRulesTotal||!this.state.latestRules)return null;var t=Object(c.y)({available_since:this.periodStartDate},this.props.organization);return a.createElement("div",{className:"boxed-group boxed-group-inner quality-profiles-evolution-rules"},a.createElement("div",{className:"clearfix"},a.createElement("strong",{className:"pull-left"},Object(s.translate)("quality_profiles.latest_new_rules"))),a.createElement("ul",null,this.state.latestRules.map(function(t){return a.createElement("li",{className:"spacer-top",key:t.key},a.createElement("div",{className:"text-ellipsis"},a.createElement(i.Link,{className:"link-no-underline",to:Object(c.y)({rule_key:t.key},e.props.organization)}," ",t.name),a.createElement("div",{className:"note"},t.activations?Object(s.translateWithParameters)("quality_profiles.latest_new_rules.activated",t.langName,t.activations):Object(s.translateWithParameters)("quality_profiles.latest_new_rules.not_activated",t.langName))))})),this.state.latestRulesTotal>10&&a.createElement("div",{className:"spacer-top"},a.createElement(i.Link,{className:"small",to:t},Object(s.translate)("see_all")," ",Object(d.formatMeasure)(this.state.latestRulesTotal,"SHORT_INT",null))))},t}(a.PureComponent),E=n(672),_=n(788);function O(e){var t=e.profiles.filter(function(e){return!e.isBuiltIn&&Object(_.f)(e)});return 0===t.length?null:a.createElement("div",{className:"boxed-group boxed-group-inner quality-profiles-evolution-stagnant"},a.createElement("div",{className:"spacer-bottom"},a.createElement("strong",null,Object(s.translate)("quality_profiles.stagnant_profiles"))),a.createElement("div",{className:"spacer-bottom"},Object(s.translate)("quality_profiles.not_updated_more_than_year")),a.createElement("ul",null,t.map(function(t){return a.createElement("li",{className:"spacer-top",key:t.key},a.createElement("div",{className:"text-ellipsis"},a.createElement(u.a,{className:"link-no-underline",language:t.language,name:t.name,organization:e.organization},t.name)),t.rulesUpdatedAt&&a.createElement(E.a,{date:t.rulesUpdatedAt,long:!0},function(e){return a.createElement("div",{className:"note"},Object(s.translateWithParameters)("quality_profiles.x_updated_on_y",t.languageName,e))}))})))}function j(e){var t=e.organization,n=e.profiles;return a.createElement("div",{className:"quality-profiles-evolution"},a.createElement(m,{organization:t,profiles:n}),a.createElement(O,{organization:t,profiles:n}),a.createElement(v,{organization:t}))}var N=n(640),w=n(656),k=n(677),C=n(657),P=n.n(C),q=n(668),x=n.n(q),S=n(683),z=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),F=function(e,t,n,r){return new(n||(n=Promise))(function(a,o){function l(e){try{s(r.next(e))}catch(e){o(e)}}function i(e){try{s(r.throw(e))}catch(e){o(e)}}function s(e){e.done?a(e.value):new n(function(t){t(e.value)}).then(l,i)}s((r=r.apply(e,t||[])).next())})},R=function(e,t){var n,r,a,o,l={label:0,sent:function(){if(1&a[0])throw a[1];return a[1]},trys:[],ops:[]};return o={next:i(0),throw:i(1),return:i(2)},"function"==typeof Symbol&&(o[Symbol.iterator]=function(){return this}),o;function i(o){return function(i){return function(o){if(n)throw new TypeError("Generator is already executing.");for(;l;)try{if(n=1,r&&(a=2&o[0]?r.return:o[0]?r.throw||((a=r.return)&&a.call(r),0):r.next)&&!(a=a.call(r,o[1])).done)return a;switch(r=0,a&&(o=[2&o[0],a.value]),o[0]){case 0:case 1:a=o;break;case 4:return l.label++,{value:o[1],done:!1};case 5:l.label++,r=o[1],o=[0];continue;case 7:o=l.ops.pop(),l.trys.pop();continue;default:if(!(a=(a=l.trys).length>0&&a[a.length-1])&&(6===o[0]||2===o[0])){l=0;continue}if(3===o[0]&&(!a||o[1]>a[0]&&o[1]<a[3])){l.label=o[1];break}if(6===o[0]&&l.label<a[1]){l.label=a[1],a=o;break}if(a&&l.label<a[2]){l.label=a[2],l.ops.push(o);break}a[2]&&l.ops.pop(),l.trys.pop();continue}o=t.call(e,l)}catch(e){o=[6,e],r=0}finally{n=a=0}if(5&o[0])throw o[1];return{value:o[0]?o[1]:void 0,done:!0}}([o,i])}}},D=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={importers:[],loading:!1,name:"",preloading:!0},t.handleNameChange=function(e){t.setState({name:e.currentTarget.value})},t.handleLanguageChange=function(e){t.setState({language:e.value})},t.handleParentChange=function(e){t.setState({parent:e?e.value:void 0})},t.handleFormSubmit=function(e){return F(t,void 0,void 0,function(){var t,n;return R(this,function(r){switch(r.label){case 0:e.preventDefault(),this.setState({loading:!0}),t=new FormData(e.currentTarget),this.props.organization&&t.append("organization",this.props.organization),r.label=1;case 1:return r.trys.push([1,,5,6]),[4,Object(S.j)(t)];case 2:return n=r.sent().profile,this.state.parent?[4,Object(S.g)(n.key,this.state.parent)]:[3,4];case 3:r.sent(),r.label=4;case 4:return this.props.onCreate(n),[3,6];case 5:return this.mounted&&this.setState({loading:!1}),[7];case 6:return[2]}})})},t}return z(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.fetchImporters()},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.fetchImporters=function(){var e=this;Object(S.o)().then(function(t){e.mounted&&e.setState({importers:t,preloading:!1})},function(){e.mounted&&e.setState({preloading:!1})})},t.prototype.render=function(){var e=Object(s.translate)("quality_profiles.new_profile"),t=l()(this.props.languages,"name"),n=[],r=this.state.language||t[0].key,o=this.state.importers.filter(function(e){return e.languages.includes(r)});if(r){var i=this.props.profiles.filter(function(e){return e.language===r});n=[{label:Object(s.translate)("none"),value:""}].concat(l()(i,"name").map(function(e){return{label:e.isBuiltIn?e.name+" ("+Object(s.translate)("quality_profiles.built_in")+")":e.name,value:e.key}}))}return a.createElement(P.a,{contentLabel:e,onRequestClose:this.props.onClose,size:"small"},a.createElement("form",{id:"create-profile-form",onSubmit:this.handleFormSubmit},a.createElement("div",{className:"modal-head"},a.createElement("h2",null,e)),this.state.preloading?a.createElement("div",{className:"modal-body"},a.createElement("i",{className:"spinner"})):a.createElement("div",{className:"modal-body"},a.createElement("div",{className:"modal-field"},a.createElement("label",{htmlFor:"create-profile-name"},Object(s.translate)("name"),a.createElement("em",{className:"mandatory"},"*")),a.createElement("input",{autoFocus:!0,id:"create-profile-name",maxLength:100,name:"name",onChange:this.handleNameChange,required:!0,size:50,type:"text",value:this.state.name})),a.createElement("div",{className:"modal-field"},a.createElement("label",{htmlFor:"create-profile-language"},Object(s.translate)("language"),a.createElement("em",{className:"mandatory"},"*")),a.createElement(x.a,{clearable:!1,id:"create-profile-language",name:"language",onChange:this.handleLanguageChange,options:t.map(function(e){return{label:e.name,value:e.key}}),value:r})),r&&n.length&&a.createElement("div",{className:"modal-field"},a.createElement("label",{htmlFor:"create-profile-parent"},Object(s.translate)("quality_profiles.parent")),a.createElement(x.a,{clearable:!0,id:"create-profile-parent",name:"parentKey",onChange:this.handleParentChange,options:n,value:this.state.parent||""})),o.map(function(e){return a.createElement("div",{className:"modal-field spacer-bottom js-importer","data-key":e.key,key:e.key},a.createElement("label",{htmlFor:"create-profile-form-backup-"+e.key},e.name),a.createElement("input",{id:"create-profile-form-backup-"+e.key,name:"backup_"+e.key,type:"file"}),a.createElement("p",{className:"note"},Object(s.translate)("quality_profiles.optional_configuration_file")))}),a.createElement("input",{name:"hello-ie11",type:"hidden",value:""})),a.createElement("div",{className:"modal-foot"},this.state.loading&&a.createElement("i",{className:"spinner spacer-right"}),!this.state.preloading&&a.createElement(N.SubmitButton,{disabled:this.state.loading,id:"create-profile-submit"},Object(s.translate)("create")),a.createElement(N.ResetButtonLink,{id:"create-profile-cancel",onClick:this.props.onClose},Object(s.translate)("cancel")))))},t}(a.PureComponent),L=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),A=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!1},t.handleFormSubmit=function(e){e.preventDefault(),t.setState({loading:!0});var n=new FormData(e.currentTarget);t.props.organization&&n.append("organization",t.props.organization),Object(S.w)(n).then(function(e){t.mounted&&t.setState({loading:!1,profile:e.profile,ruleFailures:e.ruleFailures,ruleSuccesses:e.ruleSuccesses}),t.props.onRestore()},function(){t.mounted&&t.setState({loading:!1})})},t}return L(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.renderAlert=function(e,t,n){return void 0===t&&(t=0),t?a.createElement(w.Alert,{variant:"warning"},Object(s.translateWithParameters)("quality_profiles.restore_profile.warning",e.name,n,t)):a.createElement(w.Alert,{variant:"success"},Object(s.translateWithParameters)("quality_profiles.restore_profile.success",e.name,n))},t.prototype.render=function(){var e=Object(s.translate)("quality_profiles.restore_profile"),t=this.state,n=t.loading,r=t.profile,o=t.ruleFailures,l=t.ruleSuccesses;return a.createElement(P.a,{contentLabel:e,onRequestClose:this.props.onClose,size:"small"},a.createElement("form",{id:"restore-profile-form",onSubmit:this.handleFormSubmit},a.createElement("div",{className:"modal-head"},a.createElement("h2",null,e)),a.createElement("div",{className:"modal-body"},null!=r&&null!=l?this.renderAlert(r,o,l):a.createElement("div",{className:"modal-field"},a.createElement("label",{htmlFor:"restore-profile-backup"},Object(s.translate)("backup"),a.createElement("em",{className:"mandatory"},"*")),a.createElement("input",{id:"restore-profile-backup",name:"backup",required:!0,type:"file"}))),null==l?a.createElement("div",{className:"modal-foot"},n&&a.createElement("i",{className:"spinner spacer-right"}),a.createElement(N.SubmitButton,{disabled:n,id:"restore-profile-submit"},Object(s.translate)("restore")),a.createElement(N.ResetButtonLink,{id:"restore-profile-cancel",onClick:this.props.onClose},Object(s.translate)("cancel"))):a.createElement("div",{className:"modal-foot"},a.createElement(N.ResetButtonLink,{id:"restore-profile-cancel",onClick:this.props.onClose},Object(s.translate)("close")))))},t}(a.PureComponent),I=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),W=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={createFormOpen:!1,restoreFormOpen:!1},t.handleCreateClick=function(){t.setState({createFormOpen:!0})},t.handleCreate=function(e){t.props.updateProfiles().then(function(){t.props.router.push(Object(_.c)(e.name,e.language,t.props.organization))},function(){})},t.closeCreateForm=function(){t.setState({createFormOpen:!1})},t.handleRestoreClick=function(){t.setState({restoreFormOpen:!0})},t.closeRestoreForm=function(){t.setState({restoreFormOpen:!1})},t}return I(t,e),t.prototype.render=function(){var e=this.props,t=e.actions,n=e.languages,r=e.organization,o=e.profiles;return a.createElement("header",{className:"page-header"},a.createElement("h1",{className:"page-title"},Object(s.translate)("quality_profiles.page")),t.create&&a.createElement("div",{className:"page-actions"},a.createElement(N.Button,{disabled:0===n.length,id:"quality-profiles-create",onClick:this.handleCreateClick},Object(s.translate)("create")),a.createElement(N.Button,{className:"little-spacer-left",id:"quality-profiles-restore",onClick:this.handleRestoreClick},Object(s.translate)("restore")),0===n.length&&a.createElement(w.Alert,{className:"spacer-top",variant:"warning"},Object(s.translate)("quality_profiles.no_languages_available"))),a.createElement("div",{className:"page-description markdown"},Object(s.translate)("quality_profiles.intro1"),a.createElement("br",null),Object(s.translate)("quality_profiles.intro2"),a.createElement(i.Link,{className:"spacer-left",target:"_blank",to:{pathname:"/documentation/instance-administration/quality-profiles/"}},Object(s.translate)("learn_more"))),this.state.restoreFormOpen&&a.createElement(A,{onClose:this.closeRestoreForm,onRestore:this.props.updateProfiles,organization:r}),this.state.createFormOpen&&a.createElement(D,{languages:n,onClose:this.closeCreateForm,onCreate:this.handleCreate,organization:r,profiles:o}))},t}(a.PureComponent),T=Object(k.a)(W),U=n(1975),B=n.n(U),J=n(724),M=n.n(J),H=n(669),K=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),Y=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.handleChange=function(e){var n=t.props,r=n.organization;n.router.replace(e?Object(_.d)(e.value,r):Object(_.e)(r))},t}return K(t,e),t.prototype.render=function(){var e=this.props,t=e.currentFilter,n=e.languages;if(n.length<2)return null;var r=n.map(function(e){return{label:e.name,value:e.key}}),o=t&&r.find(function(e){return e.value===t});return a.createElement("header",{className:"quality-profiles-list-header clearfix"},a.createElement("span",{className:"spacer-right"},Object(s.translate)("quality_profiles.filter_by"),":"),a.createElement(x.a,{className:"input-medium",clearable:!0,onChange:this.handleChange,options:r,value:o}))},t}(a.PureComponent),G=Object(k.a)(Y),Q=n(644),V=n.n(Q),X=n(994),Z=n(1522),$=n(1506),ee=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),te=function(e){function t(){return null!==e&&e.apply(this,arguments)||this}return ee(t,e),t.prototype.renderName=function(){var e=this.props.profile,t=25*(e.depth-1);return a.createElement("div",{className:"display-flex-center",style:{paddingLeft:t}},a.createElement("div",null,a.createElement(u.a,{language:e.language,name:e.name,organization:this.props.organization},e.name)),e.isBuiltIn&&a.createElement(X.a,{className:"spacer-left"}))},t.prototype.renderProjects=function(){var e=this.props.profile;return e.isDefault?a.createElement(H.a,{doc:Promise.resolve().then(n.bind(null,1977))},a.createElement("span",{className:"badge"},Object(s.translate)("default"))):a.createElement("span",null,e.projectCount)},t.prototype.renderRules=function(){var e=this.props.profile,t=Object(c.y)({qprofile:e.key,activation:"true"},this.props.organization),n=Object(c.y)({qprofile:e.key,activation:"true",statuses:"DEPRECATED"},this.props.organization);return a.createElement("div",null,e.activeDeprecatedRuleCount>0&&a.createElement("span",{className:"spacer-right"},a.createElement(V.a,{overlay:Object(s.translate)("quality_profiles.deprecated_rules")},a.createElement(i.Link,{className:"badge badge-error",to:n},e.activeDeprecatedRuleCount))),a.createElement(i.Link,{to:t},e.activeRuleCount))},t.prototype.render=function(){return a.createElement("tr",{className:"quality-profiles-table-row text-middle","data-key":this.props.profile.key,"data-name":this.props.profile.name},a.createElement("td",{className:"quality-profiles-table-name text-middle"},this.renderName()),a.createElement("td",{className:"quality-profiles-table-projects thin nowrap text-middle text-right"},this.renderProjects()),a.createElement("td",{className:"quality-profiles-table-rules thin nowrap text-middle text-right"},this.renderRules()),a.createElement("td",{className:"quality-profiles-table-date thin nowrap text-middle text-right"},a.createElement($.a,{date:this.props.profile.rulesUpdatedAt})),a.createElement("td",{className:"quality-profiles-table-date thin nowrap text-middle text-right"},a.createElement($.a,{date:this.props.profile.lastUsed})),a.createElement("td",{className:"quality-profiles-table-actions thin nowrap text-middle text-right"},a.createElement(Z.a,{fromList:!0,organization:this.props.organization,profile:this.props.profile,updateProfiles:this.props.updateProfiles})))},t}(a.PureComponent),ne=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),re=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.renderLanguage=function(e,n){return a.createElement("div",{className:"boxed-group boxed-group-inner quality-profiles-table",key:e},a.createElement("table",{className:"data zebra zebra-hover","data-language":e},void 0!==n&&t.renderHeader(e,n.length),a.createElement("tbody",null,void 0!==n&&t.renderProfiles(n))))},t}return ne(t,e),t.prototype.renderProfiles=function(e){var t=this;return e.map(function(e){return a.createElement(te,{key:e.key,organization:t.props.organization,profile:e,updateProfiles:t.props.updateProfiles})})},t.prototype.renderHeader=function(e,t){var r=this.props.languages.find(function(t){return t.key===e});return r?a.createElement("thead",null,a.createElement("tr",null,a.createElement("th",null,r.name,", ",Object(s.translateWithParameters)("quality_profiles.x_profiles",t)),a.createElement("th",{className:"text-right nowrap"},Object(s.translate)("quality_profiles.list.projects"),a.createElement(H.a,{className:"table-cell-doc",doc:Promise.resolve().then(n.bind(null,1278))})),a.createElement("th",{className:"text-right nowrap"},Object(s.translate)("quality_profiles.list.rules")),a.createElement("th",{className:"text-right nowrap"},Object(s.translate)("quality_profiles.list.updated")),a.createElement("th",{className:"text-right nowrap"},Object(s.translate)("quality_profiles.list.used")),a.createElement("th",null," "))):null},t.prototype.render=function(){var e=this,t=this.props,n=t.profiles,r=t.languages,o=this.props.location.query.language,i=M()(n,function(e){return e.language}),c=o?B()(i,o):i,u=l()(Object.keys(c));return a.createElement("div",null,a.createElement(G,{currentFilter:o,languages:r,organization:this.props.organization}),0===Object.keys(c).length&&a.createElement(w.Alert,{className:"spacer-top",variant:"warning"},Object(s.translate)("no_results")),u.map(function(t){return e.renderLanguage(t,c[t])}))},t}(a.PureComponent);n.d(t,"default",function(){return oe});var ae=function(){return(ae=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var a in t=arguments[n])Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a]);return e}).apply(this,arguments)};function oe(e){return a.createElement("div",null,a.createElement(T,ae({},e)),a.createElement("div",{className:"page-with-sidebar"},a.createElement("div",{className:"page-main"},a.createElement(re,ae({},e))),a.createElement("div",{className:"page-sidebar"},a.createElement(j,ae({},e)))))}},672:function(e,t,n){"use strict";n.d(t,"b",function(){return s}),n.d(t,"a",function(){return c});var r=n(12),a=n(634),o=n(160),l=function(){return(l=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var a in t=arguments[n])Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a]);return e}).apply(this,arguments)},i={year:"numeric",month:"short",day:"2-digit"},s={year:"numeric",month:"long",day:"numeric"};function c(e){var t=e.children,n=e.date,c=e.long;return r.createElement(a.FormattedDate,l({value:Object(o.parseDate)(n)},c?s:i),t)}},724:function(e,t,n){var r=n(782),a=n(727),o=Object.prototype.hasOwnProperty,l=a(function(e,t,n){o.call(e,n)?e[n].push(t):r(e,n,[t])});e.exports=l},725:function(e,t,n){"use strict";n.d(t,"e",function(){return o}),n.d(t,"f",function(){return l}),n.d(t,"g",function(){return i}),n.d(t,"c",function(){return s}),n.d(t,"d",function(){return c}),n.d(t,"a",function(){return u}),n.d(t,"b",function(){return p}),n.d(t,"h",function(){return m});var r=n(48),a=n(651);function o(e){return Object(r.getJSON)("/api/rules/app",e).catch(a.a)}function l(e){return Object(r.getJSON)("/api/rules/search",e).catch(a.a)}function i(e,t){var n=e.facets.find(function(e){return e.property===t});return n?n.values:[]}function s(e){return Object(r.getJSON)("/api/rules/show",e).catch(a.a)}function c(e){return Object(r.getJSON)("/api/rules/tags",e).then(function(e){return e.tags},a.a)}function u(e){return Object(r.postJSON)("/api/rules/create",e).then(function(e){return e.rule},function(e){return e&&409===e.status?Promise.reject(e):Object(a.a)(e)})}function p(e){return Object(r.post)("/api/rules/delete",e).catch(a.a)}function m(e){return Object(r.postJSON)("/api/rules/update",e).then(function(e){return e.rule},a.a)}},789:function(e,t,n){var r;
/*!
  Copyright (c) 2015 Jed Watson.
  Based on code that is Copyright 2013-2015, Facebook, Inc.
  All rights reserved.
*/
/*!
  Copyright (c) 2015 Jed Watson.
  Based on code that is Copyright 2013-2015, Facebook, Inc.
  All rights reserved.
*/
!function(){"use strict";var a=!("undefined"==typeof window||!window.document||!window.document.createElement),o={canUseDOM:a,canUseWorkers:"undefined"!=typeof Worker,canUseEventListeners:a&&!(!window.addEventListener&&!window.attachEvent),canUseViewport:a&&!!window.screen};void 0===(r=function(){return o}.call(t,n,t,e))||(e.exports=r)}()}}]);
//# sourceMappingURL=329.1570825310815.chunk.js.map