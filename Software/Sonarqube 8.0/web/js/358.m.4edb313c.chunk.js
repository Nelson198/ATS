(window.webpackJsonp=window.webpackJsonp||[]).push([[358],{1793:function(e,t,n){"use strict";n.r(t);var a=n(2),r=n(5),o=n(480),l=n(22),s=n(310),i=n(315),c=n.n(i),m=n(418),d=n(565),u=n(304),g=n(28),p=n(326),h=n(319);function f(e,t,n){return a.createElement("span",{key:e.key},a.createElement(g.Link,{to:Object(h.p)(e.key)},e.name),t<n.length-1&&", ")}function b(e){let t=e.organizations;return a.createElement(a.Fragment,null,a.createElement("p",{className:"big-spacer-bottom"},a.createElement(u.FormattedMessage,{defaultMessage:Object(r.translate)("my_profile.delete_account.info.orgs_to_transfer_or_delete"),id:"my_profile.delete_account.info.orgs_to_transfer_or_delete",values:{organizations:a.createElement(a.Fragment,null,t.map(f))}})),a.createElement(p.Alert,{className:"big-spacer-bottom",variant:"warning"},a.createElement(u.FormattedMessage,{defaultMessage:Object(r.translate)("my_profile.delete_account.info.orgs_to_transfer_or_delete.info"),id:"my_profile.delete_account.info.orgs_to_transfer_or_delete.info",values:{link:a.createElement("a",{href:"https://sieg.eu.ngrok.io/documentation/organizations/overview/#how-to-transfer-ownership-of-an-organization",rel:"noopener noreferrer",target:"_blank"},Object(r.translate)("my_profile.delete_account.info.orgs_to_transfer_or_delete.info.link"))}})))}function E(e){let t=e.className,n=e.organizations;const o=n.filter(e=>e.actions&&e.actions.admin);return a.createElement("ul",{className:t},a.createElement("li",{className:"spacer-bottom"},Object(r.translate)("my_profile.delete_account.info")),a.createElement("li",{className:"spacer-bottom"},a.createElement(u.FormattedMessage,{defaultMessage:Object(r.translate)("my_profile.delete_account.data.info"),id:"my_profile.delete_account.data.info",values:{help:a.createElement("a",{href:"/documentation/user-guide/user-account/#delete-your-user-account",rel:"noopener noreferrer",target:"_blank"},Object(r.translate)("learn_more"))}})),n.length>0&&a.createElement("li",{className:"spacer-bottom"},a.createElement(u.FormattedMessage,{defaultMessage:Object(r.translate)("my_profile.delete_account.info.orgs.members"),id:"my_profile.delete_account.info.orgs.members",values:{organizations:a.createElement(a.Fragment,null,n.map(f))}})),o.length>0&&a.createElement("li",{className:"spacer-bottom"},a.createElement(u.FormattedMessage,{defaultMessage:Object(r.translate)("my_profile.delete_account.info.orgs.administrators"),id:"my_profile.delete_account.info.orgs.administrators",values:{organizations:a.createElement(a.Fragment,null,o.map(f))}})))}function _(e){let t=e.className,n=e.organizationsSafeToDelete,r=e.organizationsToTransferOrDelete;return r.length>0?a.createElement(b,{organizations:r}):a.createElement(E,{className:t,organizations:n})}var O=n(316),y=n(1130),v=n.n(y),j=n(1131),w=n.n(j),N=n(437),z=n(689),M=n(347);const T={doLogout:n(409).b};var D=Object(O.connect)(()=>({}),T)(Object(M.a)(class extends a.PureComponent{constructor(){super(...arguments),this.handleSubmit=()=>{const e=this.props.user;return Object(N.c)({login:e.login}).then(this.props.doLogout).then(()=>{z.a.clear(),window.location.replace("/account-deleted")})},this.handleValidate=e=>{let t=e.login;const n=this.props.user,a={},o=t.trim();return o?n.externalIdentity&&o!==n.externalIdentity.trim()&&(a.login=Object(r.translate)("my_profile.delete_account.login.wrong_value")):a.login=Object(r.translate)("my_profile.delete_account.login.required"),a}}render(){const e=this.props,t=e.label,n=e.organizationsSafeToDelete,o=e.organizationsToTransferOrDelete,l=e.toggleModal,s=e.user;return a.createElement(w.a,{confirmButtonText:Object(r.translate)("delete"),header:Object(r.translateWithParameters)("my_profile.delete_account.modal.header",t,s.externalIdentity||""),initialValues:{login:""},isDestructive:!0,onClose:l,onSubmit:this.handleSubmit,validate:this.handleValidate},e=>{let t=e.dirty,l=e.errors,s=e.handleBlur,i=e.handleChange,c=e.isSubmitting,m=e.touched,d=e.values;return a.createElement(a.Fragment,null,a.createElement(p.Alert,{className:"big-spacer-bottom",variant:"error"},Object(r.translate)("my_profile.warning_message")),a.createElement(_,{className:"list-styled no-padding big-spacer-bottom",organizationsSafeToDelete:n,organizationsToTransferOrDelete:o}),a.createElement(v.a,{autoFocus:!0,dirty:t,disabled:c,error:l.login,id:"user-login",label:a.createElement("label",{htmlFor:"user-login"},Object(r.translate)("my_profile.delete_account.verify"),a.createElement("em",{className:"mandatory"},"*")),name:"login",onBlur:s,onChange:i,touched:m.login,type:"text",value:d.login}))})}}));var x=Object(o.a)(Object(d.a)(class extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={loading:!0,organizationsToTransferOrDelete:[],showModal:!1},this.fetchOrganizationsThatPreventDeletion=()=>{Object(m.h)().then(e=>{let t=e.organizations;this.mounted&&this.setState({loading:!1,organizationsToTransferOrDelete:t})},()=>{})},this.toggleModal=()=>{this.mounted&&this.setState(e=>({showModal:!e.showModal}))}}componentDidMount(){this.mounted=!0,this.fetchOrganizationsThatPreventDeletion()}componentWillUnmount(){this.mounted=!1}render(){const e=this.props,t=e.user,n=e.userOrganizations,o=this.state,l=o.organizationsToTransferOrDelete,i=o.loading,m=o.showModal,d=Object(r.translate)("my_profile.delete_account");return a.createElement("div",null,a.createElement("h2",{className:"spacer-bottom"},d),a.createElement(c.a,{loading:i}),!i&&a.createElement(a.Fragment,null,a.createElement(_,{className:"list-styled no-padding big-spacer-top big-spacer-bottom",organizationsSafeToDelete:n,organizationsToTransferOrDelete:l}),a.createElement(s.Button,{className:"button-red",disabled:l.length>0,onClick:this.toggleModal,type:"button"},Object(r.translate)("delete")),m&&a.createElement(D,{label:d,organizationsSafeToDelete:n,organizationsToTransferOrDelete:l,toggleModal:this.toggleModal,user:t})))}})),k=n(594),P=n(322),C=n(334);class F extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={loading:!0}}componentDidMount(){this.mounted=!0,this.fetchIdentityProviders()}componentDidUpdate(e){e.user!==this.props.user&&this.fetchIdentityProviders()}componentWillUnmount(){this.mounted=!1}fetchIdentityProviders(){this.setState({loading:!0}),Object(N.d)().then(e=>e.identityProviders).then(e=>{if(this.mounted){const t=e.find(e=>e.key===this.props.user.externalProvider);this.setState({loading:!1,identityProvider:t})}}).catch(()=>{this.mounted&&this.setState({loading:!1})})}render(){const e=this.props.user,t=this.state,n=t.loading,r=t.identityProvider;return n?null:r?a.createElement("div",{className:"identity-provider",style:{backgroundColor:r.backgroundColor,color:Object(k.getTextColor)(r.backgroundColor,C.colors.secondFontColor)}},a.createElement("img",{alt:r.name,className:"little-spacer-right",height:"14",src:Object(P.getBaseUrl)()+r.iconPath,width:"14"})," ",e.externalIdentity):a.createElement("div",null,e.externalProvider,": ",e.externalIdentity)}}function S(e){let t=e.groups;return a.createElement("div",null,a.createElement("h2",{className:"spacer-bottom"},Object(r.translate)("my_profile.groups")),a.createElement("ul",{id:"groups"},t.map(e=>a.createElement("li",{className:"little-spacer-bottom",key:e,title:e},e))))}function U(e){let t=e.user,n=e.scmAccounts;return a.createElement("div",null,a.createElement("h2",{className:"spacer-bottom"},Object(r.translate)("my_profile.scm_accounts")),a.createElement("ul",{id:"scm-accounts"},a.createElement("li",{className:"little-spacer-bottom text-ellipsis",title:t.login},t.login),t.email&&a.createElement("li",{className:"little-spacer-bottom text-ellipsis",title:t.email},t.email),n.map(e=>a.createElement("li",{className:"little-spacer-bottom",key:e,title:e},e))))}function I(e){let t=e.currentUser;return a.createElement("div",{className:"account-body account-container"},a.createElement("div",{className:"boxed-group boxed-group-inner"},a.createElement("div",{className:"spacer-bottom"},Object(r.translate)("login"),": ",a.createElement("strong",{id:"login"},t.login)),!t.local&&"sonarqube"!==t.externalProvider&&a.createElement("div",{className:"spacer-bottom",id:"identity-provider"},a.createElement(F,{user:t})),Boolean(t.email)&&a.createElement("div",{className:"spacer-bottom"},Object(r.translate)("my_profile.email"),": ",a.createElement("strong",{id:"email"},t.email)),!Object(l.isSonarCloud)()&&a.createElement(a.Fragment,null,a.createElement("hr",{className:"account-separator"}),a.createElement(S,{groups:t.groups})),a.createElement("hr",null),a.createElement(U,{scmAccounts:t.scmAccounts,user:t}),Object(l.isSonarCloud)()&&a.createElement(a.Fragment,null,a.createElement("hr",null),a.createElement(x,{user:t}))))}n.d(t,"Profile",function(){return I});t.default=Object(o.a)(I)},465:function(e,t,n){var a;
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
!function(){"use strict";var r=!("undefined"==typeof window||!window.document||!window.document.createElement),o={canUseDOM:r,canUseWorkers:"undefined"!=typeof Worker,canUseEventListeners:r&&!(!window.addEventListener&&!window.attachEvent),canUseViewport:r&&!!window.screen};void 0===(a=function(){return o}.call(t,n,t,e))||(e.exports=a)}()},480:function(e,t,n){"use strict";n.d(t,"a",function(){return c});var a=n(2),r=n(31),o=n.n(r),l=n(329),s=n(393),i=n(438);function c(e){class t extends a.Component{componentDidMount(){Object(l.b)(this.props.currentUser)||o()()}render(){return Object(l.b)(this.props.currentUser)?a.createElement(e,Object.assign({},this.props)):null}}return t.displayName=Object(s.a)(e,"whenLoggedIn"),Object(i.a)(t)}},565:function(e,t,n){"use strict";n.d(t,"a",function(){return i});var a=n(2),r=n(316),o=n(617),l=n(317),s=n(393);function i(e){class t extends a.Component{componentDidMount(){this.props.fetchMyOrganizations()}render(){return a.createElement(e,Object.assign({},this.props))}}t.displayName=Object(s.a)(e,"withUserOrganizations");const n={fetchMyOrganizations:o.b};return Object(r.connect)(function(e){return{userOrganizations:Object(l.getMyOrganizations)(e)}},n)(t)}}}]);
//# sourceMappingURL=358.m.4edb313c.chunk.js.map