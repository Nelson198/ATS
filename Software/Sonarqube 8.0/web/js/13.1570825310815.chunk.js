(window.webpackJsonp=window.webpackJsonp||[]).push([[13],{1009:function(e,t,n){"use strict";n.d(t,"a",function(){return c});var r=n(12),o=n(159),a=n(788),i=function(){return(i=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)},l=function(e,t){var n={};for(var r in e)Object.prototype.hasOwnProperty.call(e,r)&&t.indexOf(r)<0&&(n[r]=e[r]);if(null!=e&&"function"==typeof Object.getOwnPropertySymbols){var o=0;for(r=Object.getOwnPropertySymbols(e);o<r.length;o++)t.indexOf(r[o])<0&&(n[r[o]]=e[r[o]])}return n};function c(e){var t=e.name,n=e.language,c=e.organization,s=e.children,u=l(e,["name","language","organization","children"]);return r.createElement(o.Link,i({activeClassName:"link-no-underline",to:Object(a.c)(t,n,c)},u),s)}},1037:function(e,t,n){"use strict";n.r(t),t.default="Built-in profiles are provided directly by the language analyzers and may be updated with each new analyzer version. They represent best-practice, minimum rule sets.\n"},1506:function(e,t,n){"use strict";n.d(t,"a",function(){return s});var r=n(12),o=n(644),a=n.n(o),i=n(34),l=n(689),c=n(674);function s(e){var t=e.date;return t?r.createElement(a.a,{overlay:r.createElement(c.a,{date:t})},r.createElement("span",null,r.createElement(l.a,{date:t}))):r.createElement("span",null,Object(i.translate)("never"))}},1522:function(e,t,n){"use strict";var r,o=n(12),a=n(702),i=n.n(a),l=n(34),c=n(683),s=n(677),u=n(649),p=n(788),m=n(640),f=n(657),d=n.n(f),h=(r=function(e,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}r(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)}),y=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!1,name:null},t.handleNameChange=function(e){t.setState({name:e.currentTarget.value})},t.handleFormSubmit=function(e){e.preventDefault();var n=t.state.name;null!=n&&(t.setState({loading:!0}),Object(c.i)(t.props.profile.key,n).then(function(e){return t.props.onCopy(e.name)},function(){t.mounted&&t.setState({loading:!1})}))},t}return h(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this.props.profile,t=Object(l.translateWithParameters)("quality_profiles.copy_x_title",e.name,e.languageName),n=this.state.loading||!this.state.name||this.state.name===e.name;return o.createElement(d.a,{contentLabel:t,onRequestClose:this.props.onClose,size:"small"},o.createElement("form",{id:"copy-profile-form",onSubmit:this.handleFormSubmit},o.createElement("div",{className:"modal-head"},o.createElement("h2",null,t)),o.createElement("div",{className:"modal-body"},o.createElement("div",{className:"modal-field"},o.createElement("label",{htmlFor:"copy-profile-name"},Object(l.translate)("quality_profiles.copy_new_name"),o.createElement("em",{className:"mandatory"},"*")),o.createElement("input",{autoFocus:!0,id:"copy-profile-name",maxLength:100,name:"name",onChange:this.handleNameChange,required:!0,size:50,type:"text",value:null!=this.state.name?this.state.name:e.name}))),o.createElement("div",{className:"modal-foot"},this.state.loading&&o.createElement("i",{className:"spinner spacer-right"}),o.createElement(m.SubmitButton,{disabled:n,id:"copy-profile-submit"},Object(l.translate)("copy")),o.createElement(m.ResetButtonLink,{id:"copy-profile-cancel",onClick:this.props.onClose},Object(l.translate)("cancel")))))},t}(o.PureComponent),b=n(656),v=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),O=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!1,name:null},t.handleFormSubmit=function(e){e.preventDefault(),t.setState({loading:!0}),Object(c.l)(t.props.profile.key).then(t.props.onDelete,function(){t.mounted&&t.setState({loading:!1})})},t}return v(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this.props.profile,t=Object(l.translate)("quality_profiles.delete_confirm_title");return o.createElement(d.a,{contentLabel:t,onRequestClose:this.props.onClose},o.createElement("form",{id:"delete-profile-form",onSubmit:this.handleFormSubmit},o.createElement("div",{className:"modal-head"},o.createElement("h2",null,t)),o.createElement("div",{className:"modal-body"},o.createElement("div",{className:"js-modal-messages"}),e.childrenCount>0?o.createElement("div",null,o.createElement(b.Alert,{variant:"warning"},Object(l.translate)("quality_profiles.this_profile_has_descendants")),o.createElement("p",null,Object(l.translateWithParameters)("quality_profiles.are_you_sure_want_delete_profile_x_and_descendants",e.name,e.languageName))):o.createElement("p",null,Object(l.translateWithParameters)("quality_profiles.are_you_sure_want_delete_profile_x",e.name,e.languageName))),o.createElement("div",{className:"modal-foot"},this.state.loading&&o.createElement("i",{className:"spinner spacer-right"}),o.createElement(m.SubmitButton,{className:"button-red",disabled:this.state.loading,id:"delete-profile-submit"},Object(l.translate)("delete")),o.createElement(m.ResetButtonLink,{id:"delete-profile-cancel",onClick:this.props.onClose},Object(l.translate)("cancel")))))},t}(o.PureComponent),g=n(645),_=n.n(g),C=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),E=function(e,t,n,r){return new(n||(n=Promise))(function(o,a){function i(e){try{c(r.next(e))}catch(e){a(e)}}function l(e){try{c(r.throw(e))}catch(e){a(e)}}function c(e){e.done?o(e.value):new n(function(t){t(e.value)}).then(i,l)}c((r=r.apply(e,t||[])).next())})},j=function(e,t){var n,r,o,a,i={label:0,sent:function(){if(1&o[0])throw o[1];return o[1]},trys:[],ops:[]};return a={next:l(0),throw:l(1),return:l(2)},"function"==typeof Symbol&&(a[Symbol.iterator]=function(){return this}),a;function l(a){return function(l){return function(a){if(n)throw new TypeError("Generator is already executing.");for(;i;)try{if(n=1,r&&(o=2&a[0]?r.return:a[0]?r.throw||((o=r.return)&&o.call(r),0):r.next)&&!(o=o.call(r,a[1])).done)return o;switch(r=0,o&&(a=[2&a[0],o.value]),a[0]){case 0:case 1:o=a;break;case 4:return i.label++,{value:a[1],done:!1};case 5:i.label++,r=a[1],a=[0];continue;case 7:a=i.ops.pop(),i.trys.pop();continue;default:if(!(o=(o=i.trys).length>0&&o[o.length-1])&&(6===a[0]||2===a[0])){i=0;continue}if(3===a[0]&&(!o||a[1]>o[0]&&a[1]<o[3])){i.label=a[1];break}if(6===a[0]&&i.label<o[1]){i.label=o[1],o=a;break}if(o&&i.label<o[2]){i.label=o[2],i.ops.push(a);break}o[2]&&i.ops.pop(),i.trys.pop();continue}a=t.call(e,i)}catch(e){a=[6,e],r=0}finally{n=o=0}if(5&a[0])throw a[1];return{value:a[0]?a[1]:void 0,done:!0}}([a,l])}}},N=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!1},t.canSubmit=function(e){return Boolean(e.name&&e.name.length)},t.handleNameChange=function(e){t.setState({name:e.currentTarget.value})},t.handleFormSubmit=function(){return E(t,void 0,void 0,function(){var e,t,n,r,o,a;return j(this,function(i){switch(i.label){case 0:if(!this.canSubmit(this.state))return[3,5];e=this.props,t=e.organization,n=e.profile,r=this.state.name,(o=new FormData).append("language",n.language),o.append("name",r),t&&o.append("organization",t),this.setState({loading:!0}),i.label=1;case 1:return i.trys.push([1,,4,5]),[4,Object(c.j)(o)];case 2:return a=i.sent().profile,[4,Object(c.g)(a.key,n.key)];case 3:return i.sent(),this.props.onExtend(a.name),[3,5];case 4:return this.mounted&&this.setState({loading:!1}),[7];case 5:return[2]}})})},t}return C(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this.props.profile,t=Object(l.translateWithParameters)("quality_profiles.extend_x_title",e.name,e.languageName);return o.createElement(d.a,{contentLabel:t,onRequestClose:this.props.onClose,size:"small"},o.createElement("form",null,o.createElement("div",{className:"modal-head"},o.createElement("h2",null,t)),o.createElement("div",{className:"modal-body"},o.createElement("div",{className:"modal-field"},o.createElement("label",{htmlFor:"extend-profile-name"},Object(l.translate)("quality_profiles.copy_new_name"),o.createElement("em",{className:"mandatory"},"*")),o.createElement("input",{autoFocus:!0,id:"extend-profile-name",maxLength:100,name:"name",onChange:this.handleNameChange,required:!0,size:50,type:"text",value:this.state.name?this.state.name:""}))),o.createElement("div",{className:"modal-foot"},o.createElement(_.a,{className:"spacer-right",loading:this.state.loading}),o.createElement(m.SubmitButton,{disabled:this.state.loading||!this.canSubmit(this.state),id:"extend-profile-submit",onClick:this.handleFormSubmit},Object(l.translate)("extend")),o.createElement(m.ResetButtonLink,{id:"extend-profile-cancel",onClick:this.props.onClose},Object(l.translate)("cancel")))))},t}(o.PureComponent),w=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),x=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!1,name:null},t.handleNameChange=function(e){t.setState({name:e.currentTarget.value})},t.handleFormSubmit=function(e){e.preventDefault();var n=t.state.name;null!=n&&(t.setState({loading:!0}),Object(c.v)(t.props.profile.key,n).then(function(){return t.props.onRename(n)},function(){t.mounted&&t.setState({loading:!1})}))},t}return w(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this.props.profile,t=Object(l.translateWithParameters)("quality_profiles.rename_x_title",e.name,e.languageName),n=this.state.loading||!this.state.name||this.state.name===e.name;return o.createElement(d.a,{contentLabel:t,onRequestClose:this.props.onClose,size:"small"},o.createElement("form",{id:"rename-profile-form",onSubmit:this.handleFormSubmit},o.createElement("div",{className:"modal-head"},o.createElement("h2",null,t)),o.createElement("div",{className:"modal-body"},o.createElement("div",{className:"modal-field"},o.createElement("label",{htmlFor:"rename-profile-name"},Object(l.translate)("quality_profiles.new_name"),o.createElement("em",{className:"mandatory"},"*")),o.createElement("input",{autoFocus:!0,id:"rename-profile-name",maxLength:100,name:"name",onChange:this.handleNameChange,required:!0,size:50,type:"text",value:null!=this.state.name?this.state.name:e.name}))),o.createElement("div",{className:"modal-foot"},this.state.loading&&o.createElement("i",{className:"spinner spacer-right"}),o.createElement(m.SubmitButton,{disabled:n,id:"rename-profile-submit"},Object(l.translate)("rename")),o.createElement(m.ResetButtonLink,{id:"rename-profile-cancel",onClick:this.props.onClose},Object(l.translate)("cancel")))))},t}(o.PureComponent),S=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),q=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={copyFormOpen:!1,extendFormOpen:!1,deleteFormOpen:!1,renameFormOpen:!1},t.closeCopyForm=function(){t.setState({copyFormOpen:!1})},t.closeDeleteForm=function(){t.setState({deleteFormOpen:!1})},t.closeExtendForm=function(){t.setState({extendFormOpen:!1})},t.closeRenameForm=function(){t.setState({renameFormOpen:!1})},t.handleCopyClick=function(){t.setState({copyFormOpen:!0})},t.handleDeleteClick=function(){t.setState({deleteFormOpen:!0})},t.handleExtendClick=function(){t.setState({extendFormOpen:!0})},t.handleRenameClick=function(){t.setState({renameFormOpen:!0})},t.handleProfileCopy=function(e){t.closeCopyForm(),t.navigateToNewProfile(e)},t.handleProfileDelete=function(){t.props.router.replace(Object(p.e)(t.props.organization)),t.props.updateProfiles()},t.handleProfileExtend=function(e){t.closeExtendForm(),t.navigateToNewProfile(e)},t.handleProfileRename=function(e){t.closeRenameForm(),t.props.updateProfiles().then(function(){t.props.fromList||t.props.router.replace(Object(p.c)(e,t.props.profile.language,t.props.organization))},function(){})},t.handleSetDefaultClick=function(){Object(c.A)(t.props.profile.key).then(t.props.updateProfiles,function(){})},t.navigateToNewProfile=function(e){t.props.updateProfiles().then(function(){t.props.router.push(Object(p.c)(e,t.props.profile.language,t.props.organization))},function(){})},t}return S(t,e),t.prototype.render=function(){var e=this.props.profile,t=e.actions,n=void 0===t?{}:t,r=window.baseUrl+"/api/qualityprofiles/backup?profileKey="+encodeURIComponent(e.key),c=Object(u.y)({qprofile:e.key,activation:"false"},this.props.organization);return o.createElement(o.Fragment,null,o.createElement(i.a,{className:this.props.className},n.edit&&o.createElement(a.ActionsDropdownItem,{to:c},o.createElement("span",{"data-test":"quality-profiles__activate-more-rules"},Object(l.translate)("quality_profiles.activate_more_rules"))),!e.isBuiltIn&&o.createElement(a.ActionsDropdownItem,{download:e.key+".xml",to:r},o.createElement("span",{"data-test":"quality-profiles__backup"},Object(l.translate)("backup_verb"))),o.createElement(a.ActionsDropdownItem,{to:Object(p.b)(e.name,e.language,this.props.organization)},o.createElement("span",{"data-test":"quality-profiles__compare"},Object(l.translate)("compare"))),n.copy&&o.createElement(o.Fragment,null,o.createElement(a.ActionsDropdownItem,{onClick:this.handleCopyClick},o.createElement("span",{"data-test":"quality-profiles__copy"},Object(l.translate)("copy"))),o.createElement(a.ActionsDropdownItem,{onClick:this.handleExtendClick},o.createElement("span",{"data-test":"quality-profiles__extend"},Object(l.translate)("extend")))),n.edit&&o.createElement(a.ActionsDropdownItem,{onClick:this.handleRenameClick},o.createElement("span",{"data-test":"quality-profiles__rename"},Object(l.translate)("rename"))),n.setAsDefault&&o.createElement(a.ActionsDropdownItem,{onClick:this.handleSetDefaultClick},o.createElement("span",{"data-test":"quality-profiles__set-as-default"},Object(l.translate)("set_as_default"))),n.delete&&o.createElement(a.ActionsDropdownDivider,null),n.delete&&o.createElement(a.ActionsDropdownItem,{destructive:!0,onClick:this.handleDeleteClick},o.createElement("span",{"data-test":"quality-profiles__delete"},Object(l.translate)("delete")))),this.state.copyFormOpen&&o.createElement(y,{onClose:this.closeCopyForm,onCopy:this.handleProfileCopy,profile:e}),this.state.extendFormOpen&&o.createElement(N,{onClose:this.closeExtendForm,onExtend:this.handleProfileExtend,organization:this.props.organization,profile:e}),this.state.deleteFormOpen&&o.createElement(O,{onClose:this.closeDeleteForm,onDelete:this.handleProfileDelete,profile:e}),this.state.renameFormOpen&&o.createElement(x,{onClose:this.closeRenameForm,onRename:this.handleProfileRename,profile:e}))},t}(o.PureComponent);t.a=Object(s.a)(q)},653:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=n(639),o=n(12),a=n(692),i=n(665);n(666);var l=n(644);t.default=function(e){var t=e.tagName,n=void 0===t?"div":t;return o.createElement(n,{className:r("help-tooltip",e.className)},o.createElement(l.default,{mouseLeaveDelay:.25,onShow:e.onShow,overlay:e.overlay,placement:e.placement},o.createElement("span",{className:"display-inline-flex-center"},e.children||o.createElement(i.ThemeConsumer,null,function(e){return o.createElement(a.default,{fill:e.colors.gray71,size:12})}))))}},666:function(e,t,n){var r=n(667);"string"==typeof r&&(r=[[e.i,r,""]]);var o={hmr:!0,transform:void 0,insertInto:void 0};n(643)(r,o);r.locals&&(e.exports=r.locals)},667:function(e,t,n){(e.exports=n(642)(!1)).push([e.i,".help-tooltip{display:inline-flex;align-items:center;vertical-align:middle}.help-toolip-link{display:block;width:12px;height:12px;border:none}",""])},669:function(e,t,n){"use strict";var r,o=n(12),a=n(653),i=n.n(a),l=n(650),c=n(694),s=(r=function(e,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}r(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)}),u=Object(l.lazyLoad)(function(){return Promise.all([n.e(7),n.e(10)]).then(n.bind(null,804))}),p=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={open:!1},t.close=function(){t.mounted&&t.setState({open:!1})},t}return s(t,e),t.prototype.componentDidMount=function(){var e=this;this.mounted=!0,this.props.doc.then(function(t){var n=t.default;e.mounted&&e.setState({content:n})},function(){}),document.addEventListener("scroll",this.close,!0)},t.prototype.componentWillUnmount=function(){this.mounted=!1,document.removeEventListener("scroll",this.close,!0)},t.prototype.render=function(){return this.state.content?o.createElement(i.a,{className:this.props.className,overlay:o.createElement("div",{className:"abs-width-300"},o.createElement(u,{childProps:this.props.overlayProps,className:"cut-margins",content:Object(c.filterContent)(this.state.content),isTooltip:!0}))},this.props.children):this.props.children||null},t}(o.PureComponent);t.a=p},674:function(e,t,n){"use strict";n.d(t,"b",function(){return l}),n.d(t,"a",function(){return c});var r=n(12),o=n(634),a=n(160),i=function(){return(i=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)},l={year:"numeric",month:"long",day:"numeric",hour:"numeric",minute:"numeric"};function c(e){var t=e.children,n=e.date;return r.createElement(o.FormattedDate,i({value:Object(a.parseDate)(n)},l),t)}},683:function(e,t,n){"use strict";n.d(t,"y",function(){return s}),n.d(t,"s",function(){return u}),n.d(t,"j",function(){return p}),n.d(t,"w",function(){return m}),n.d(t,"r",function(){return f}),n.d(t,"q",function(){return d}),n.d(t,"A",function(){return h}),n.d(t,"v",function(){return y}),n.d(t,"i",function(){return b}),n.d(t,"l",function(){return v}),n.d(t,"g",function(){return O}),n.d(t,"o",function(){return g}),n.d(t,"n",function(){return _}),n.d(t,"p",function(){return C}),n.d(t,"h",function(){return E}),n.d(t,"d",function(){return j}),n.d(t,"m",function(){return N}),n.d(t,"z",function(){return w}),n.d(t,"x",function(){return x}),n.d(t,"c",function(){return S}),n.d(t,"u",function(){return q}),n.d(t,"b",function(){return k}),n.d(t,"t",function(){return P}),n.d(t,"e",function(){return F}),n.d(t,"f",function(){return L}),n.d(t,"a",function(){return D}),n.d(t,"k",function(){return z});var r=n(684),o=n.n(r),a=n(796),i=n(48),l=n(651),c=function(){return(c=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)};function s(e){return Object(i.getJSON)("/api/qualityprofiles/search",e).catch(l.a)}function u(e){return Object(i.getJSON)("/api/qualityprofiles/show",e)}function p(e){return Object(i.postJSON)("/api/qualityprofiles/create",e).catch(l.a)}function m(e){return Object(i.postJSON)("/api/qualityprofiles/restore",e).catch(l.a)}function f(e){return Object(i.getJSON)("/api/qualityprofiles/projects",e).catch(l.a)}function d(e){return Object(i.getJSON)("/api/qualityprofiles/inheritance",{profileKey:e}).catch(l.a)}function h(e){return Object(i.post)("/api/qualityprofiles/set_default",{profileKey:e})}function y(e,t){return Object(i.post)("/api/qualityprofiles/rename",{key:e,name:t}).catch(l.a)}function b(e,t){return Object(i.postJSON)("/api/qualityprofiles/copy",{fromKey:e,toName:t}).catch(l.a)}function v(e){return Object(i.post)("/api/qualityprofiles/delete",{profileKey:e}).catch(l.a)}function O(e,t){return Object(i.post)("/api/qualityprofiles/change_parent",{profileKey:e,parentKey:t}).catch(l.a)}function g(){return Object(i.getJSON)("/api/qualityprofiles/importers").then(function(e){return e.importers},l.a)}function _(){return Object(i.getJSON)("/api/qualityprofiles/exporters").then(function(e){return e.exporters})}function C(e){return Object(i.getJSON)("/api/qualityprofiles/changelog",e)}function E(e,t){return Object(i.getJSON)("/api/qualityprofiles/compare",{leftKey:e,rightKey:t})}function j(e,t){return Object(i.post)("/api/qualityprofiles/add_project",{key:e,project:t}).catch(l.a)}function N(e,t){return Object(i.post)("/api/qualityprofiles/remove_project",{key:e,project:t}).catch(l.a)}function w(e){return Object(i.getJSON)("/api/qualityprofiles/search_users",e).catch(l.a)}function x(e){return Object(i.getJSON)("/api/qualityprofiles/search_groups",e).catch(l.a)}function S(e){return Object(i.post)("/api/qualityprofiles/add_user",e).catch(l.a)}function q(e){return Object(i.post)("/api/qualityprofiles/remove_user",e).catch(l.a)}function k(e){return Object(i.post)("/api/qualityprofiles/add_group",e).catch(l.a)}function P(e){return Object(i.post)("/api/qualityprofiles/remove_group",e).catch(l.a)}function F(e){return Object(i.postJSON)("/api/qualityprofiles/activate_rules",e)}function L(e){return Object(i.postJSON)("/api/qualityprofiles/deactivate_rules",e)}function D(e){var t=e.params&&o()(e.params,function(e,t){return t+"="+Object(a.csvEscape)(e)}).join(";");return Object(i.post)("/api/qualityprofiles/activate_rule",c({},e,{params:t})).catch(l.a)}function z(e){return Object(i.post)("/api/qualityprofiles/deactivate_rule",e).catch(l.a)}},684:function(e,t,n){var r=n(700),o=n(670),a=n(753),i=n(685);e.exports=function(e,t){return(i(e)?r:a)(e,o(t,3))}},689:function(e,t,n){"use strict";n.d(t,"a",function(){return i});var r=n(12),o=n(634),a=n(160);function i(e){var t=e.children,n=e.date;return r.createElement(o.FormattedRelative,{value:Object(a.parseDate)(n)},t)}},694:function(e,t,n){"use strict";function r(e){for(var t,n,r=0;r<e.length;r++){if("---"===e[r].trim()){if(void 0!==t){n=r;break}t=r}}return void 0!==n?{firstLine:t,lastLine:n}:void 0}function o(e){for(var t={},n=0;n<e.length;n++){var r=e[n].split(":").map(function(e){return e.trim()});2===r.length&&(t[r[0]]=r[1])}return t}function a(e,t){for(var n="\x3c!-- "+t+" --\x3e",r="\x3c!-- /"+t+" --\x3e",o=e,a=o.indexOf(n),i=o.indexOf(r);-1!==a&&-1!==i;)a=(o=o.substring(0,a)+o.substring(i+r.length)).indexOf(n),i=o.indexOf(r);return o}e.exports={getFrontMatter:function(e){var t=e.split("\n"),n=r(t);return n?o(t.slice(n.firstLine+1,n.lastLine)):{}},separateFrontMatter:function(e){var t=e.split("\n"),n=r(t);if(n){var a=o(t.slice(n.firstLine+1,n.lastLine)),i=t.slice(n.lastLine+1).join("\n");return{frontmatter:a,content:i}}return{frontmatter:{},content:e}},filterContent:function(e){var t="\x3c!-- \\/?(sonarqube|sonarcloud|static) --\x3e",r=n(118),o=r.isSonarCloud,i=r.getInstance,l=a(e.replace(/{instance}/gi,i()),"static");return(o()?a(l,"sonarqube"):a(l,"sonarcloud")).replace(new RegExp("^"+t+"(\n|\r|\r\n|$)","gm"),"").replace(new RegExp(""+t,"g"),"")}}},702:function(e,t,n){"use strict";var r,o=this&&this.__extends||(r=function(e,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}r(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)});Object.defineProperty(t,"__esModule",{value:!0});var a=n(639),i=n(12),l=n(159),c=n(663),s=n(703),u=n(640),p=n(658);t.default=function(e){return i.createElement(p.default,{className:e.className,onOpen:e.onOpen,overlay:i.createElement("ul",{className:"menu"},e.children)},i.createElement(u.Button,{className:a("dropdown-toggle",e.toggleClassName,{"button-small":e.small})},i.createElement(s.default,{size:e.small?12:14}),i.createElement(c.default,{className:"little-spacer-left"})))};var m=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.handleClick=function(e){e.preventDefault(),e.currentTarget.blur(),t.props.onClick&&t.props.onClick()},t}return o(t,e),t.prototype.render=function(){var e=a(this.props.className,{"text-danger":this.props.destructive});return this.props.download&&"string"==typeof this.props.to?i.createElement("li",null,i.createElement("a",{className:e,download:this.props.download,href:this.props.to,id:this.props.id},this.props.children)):this.props.to?i.createElement("li",null,i.createElement(l.Link,{className:e,id:this.props.id,to:this.props.to},this.props.children)):i.createElement("li",null,i.createElement("a",{className:e,href:"#",id:this.props.id,onClick:this.handleClick},this.props.children))},t}(i.PureComponent);t.ActionsDropdownItem=m,t.ActionsDropdownDivider=function(){return i.createElement("li",{className:"divider"})}},703:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=n(12),o=n(641);t.default=function(e){var t=e.className,n=e.fill,a=void 0===n?"currentColor":n,i=e.size,l=void 0===i?14:i;return r.createElement(o.default,{className:t,size:l,viewBox:"0 0 14 14"},r.createElement("g",{transform:"matrix(0.0364583,0,0,0.0364583,0,-1.16667)"},r.createElement("path",{d:"M256,224C256,206.333 249.75,191.25 237.25,178.75C224.75,166.25 209.667,160 192,160C174.333,160 159.25,166.25 146.75,178.75C134.25,191.25 128,206.333 128,224C128,241.667 134.25,256.75 146.75,269.25C159.25,281.75 174.333,288 192,288C209.667,288 224.75,281.75 237.25,269.25C249.75,256.75 256,241.667 256,224ZM384,196.75L384,252.25C384,254.25 383.333,256.167 382,258C380.667,259.833 379,260.917 377,261.25L330.75,268.25C327.583,277.25 324.333,284.833 321,291C326.833,299.333 335.75,310.833 347.75,325.5C349.417,327.5 350.25,329.583 350.25,331.75C350.25,333.917 349.5,335.833 348,337.5C343.5,343.667 335.25,352.667 323.25,364.5C311.25,376.333 303.417,382.25 299.75,382.25C297.75,382.25 295.583,381.5 293.25,380L258.75,353C251.417,356.833 243.833,360 236,362.5C233.333,385.167 230.917,400.667 228.75,409C227.583,413.667 224.583,416 219.75,416L164.25,416C161.917,416 159.875,415.292 158.125,413.875C156.375,412.458 155.417,410.667 155.25,408.5L148.25,362.5C140.083,359.833 132.583,356.75 125.75,353.25L90.5,380C88.833,381.5 86.75,382.25 84.25,382.25C81.917,382.25 79.833,381.333 78,379.5C57,360.5 43.25,346.5 36.75,337.5C35.583,335.833 35,333.917 35,331.75C35,329.75 35.667,327.833 37,326C39.5,322.5 43.75,316.958 49.75,309.375C55.75,301.792 60.25,295.917 63.25,291.75C58.75,283.417 55.333,275.167 53,267L7.25,260.25C5.083,259.917 3.333,258.875 2,257.125C0.667,255.375 0,253.417 0,251.25L0,195.75C0,193.75 0.667,191.833 2,190C3.333,188.167 4.917,187.083 6.75,186.75L53.25,179.75C55.583,172.083 58.833,164.417 63,156.75C56.333,147.25 47.417,135.75 36.25,122.25C34.583,120.25 33.75,118.25 33.75,116.25C33.75,114.583 34.5,112.667 36,110.5C40.333,104.5 48.542,95.542 60.625,83.625C72.708,71.708 80.583,65.75 84.25,65.75C86.417,65.75 88.583,66.583 90.75,68.25L125.25,95C132.583,91.167 140.167,88 148,85.5C150.667,62.833 153.083,47.333 155.25,39C156.417,34.333 159.417,32 164.25,32L219.75,32C222.083,32 224.125,32.708 225.875,34.125C227.625,35.542 228.583,37.333 228.75,39.5L235.75,85.5C243.917,88.167 251.417,91.25 258.25,94.75L293.75,68C295.25,66.5 297.25,65.75 299.75,65.75C301.917,65.75 304,66.583 306,68.25C327.5,88.083 341.25,102.25 347.25,110.75C348.417,112.083 349,113.917 349,116.25C349,118.25 348.333,120.167 347,122C344.5,125.5 340.25,131.042 334.25,138.625C328.25,146.208 323.75,152.083 320.75,156.25C325.083,164.583 328.5,172.75 331,180.75L376.75,187.75C378.917,188.083 380.667,189.125 382,190.875C383.333,192.625 384,194.583 384,196.75Z",style:{fill:a}})))}},796:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.csvEscape=function(e){return'"'+e.replace(/"/g,'\\"')+'"'}},994:function(e,t,n){"use strict";n.d(t,"a",function(){return l});var r=n(639),o=n(12),a=n(34),i=n(669);function l(e){var t=e.className,l=e.tooltip,c=void 0===l||l,s=o.createElement("div",{className:r("badge badge-info",t)},Object(a.translate)("quality_profiles.built_in"));return c?o.createElement(i.a,{doc:Promise.resolve().then(n.bind(null,1037))},s):s}}}]);
//# sourceMappingURL=13.1570825310815.chunk.js.map