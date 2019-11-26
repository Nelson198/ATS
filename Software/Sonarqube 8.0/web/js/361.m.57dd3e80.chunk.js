(window.webpackJsonp=window.webpackJsonp||[]).push([[361],{1132:function(e,t,a){"use strict";a.r(t),a.d(t,"default",function(){return f});var n=a(309),s=a(2),i=a(310),l=a(327),r=a.n(l),o=a(338),c=a.n(o),m=a(326),d=a(5),h=a(353),u=a(380),p=a(462),v=a(464);class f extends s.PureComponent{constructor(e){var t;super(e),t=this,this.mounted=!1,this.getParams=function(){let e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:t.props,a=e.activation,n=e.rule;const s={};if(n&&n.params){for(const e of n.params)s[e.key]=e.defaultValue||"";if(a&&a.params)for(const e of a.params)s[e.key]=e.value}return s},this.getQualityProfilesWithDepth=function(){let e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:t.props,a=e.profiles;return Object(v.g)(a.filter(e=>!e.isBuiltIn&&e.actions&&e.actions.edit&&e.language===t.props.rule.lang)).map(e=>Object.assign({},e,{depth:e.depth-1}))},this.handleFormSubmit=e=>{e.preventDefault(),this.setState({submitting:!0});const t={key:this.state.profile,organization:this.props.organization,params:this.state.params,rule:this.props.rule.key,severity:this.state.severity};Object(h.a)(t).then(()=>this.props.onDone(t.severity)).then(()=>{this.mounted&&(this.setState({submitting:!1}),this.props.onClose())},()=>{this.mounted&&this.setState({submitting:!1})})},this.handleParameterChange=e=>{const t=e.currentTarget,a=t.name,n=t.value;this.setState(e=>({params:Object.assign({},e.params,{[a]:n})}))},this.handleProfileChange=e=>{let t=e.value;this.setState({profile:t})},this.handleSeverityChange=e=>{let t=e.value;this.setState({severity:t})},this.renderSeverityOption=e=>{let t=e.value;return s.createElement(u.a,{severity:t})};const a=this.getQualityProfilesWithDepth(e);this.state={params:this.getParams(e),profile:a.length>0?a[0].key:"",severity:e.activation?e.activation.severity:e.rule.severity,submitting:!1}}componentDidMount(){this.mounted=!0}componentWillUnmount(){this.mounted=!1}render(){const e=this.props,t=e.activation,a=e.rule,l=this.state,o=l.profile,h=l.severity,u=l.submitting,v=a.params,f=void 0===v?[]:v,y=this.getQualityProfilesWithDepth(),g=!!a.templateKey,b=y.length<=0,E=!!t;return s.createElement(r.a,{contentLabel:this.props.modalHeader,onRequestClose:this.props.onClose,size:"small"},s.createElement("form",{onSubmit:this.handleFormSubmit},s.createElement("div",{className:"modal-head"},s.createElement("h2",null,this.props.modalHeader)),s.createElement("div",{className:n("modal-body",{"modal-container":f.length>0})},!E&&b&&s.createElement(m.Alert,{variant:"info"},Object(d.translate)("coding_rules.active_in_all_profiles")),s.createElement("div",{className:"modal-field"},s.createElement("label",null,Object(d.translate)("coding_rules.quality_profile")),s.createElement(c.a,{className:"js-profile",clearable:!1,disabled:u||1===y.length,onChange:this.handleProfileChange,options:y.map(e=>({label:"   ".repeat(e.depth)+e.name,value:e.key})),value:o})),s.createElement("div",{className:"modal-field"},s.createElement("label",null,Object(d.translate)("severity")),s.createElement(c.a,{className:"js-severity",clearable:!1,disabled:u,onChange:this.handleSeverityChange,optionRenderer:this.renderSeverityOption,options:p.e.map(e=>({label:Object(d.translate)("severity",e),value:e})),searchable:!1,value:h,valueRenderer:this.renderSeverityOption})),g?s.createElement("div",{className:"modal-field"},s.createElement("p",{className:"note"},Object(d.translate)("coding_rules.custom_rule.activation_notice"))):f.map(e=>s.createElement("div",{className:"modal-field",key:e.key},s.createElement("label",{title:e.key},e.key),"TEXT"===e.type?s.createElement("textarea",{disabled:u,name:e.key,onChange:this.handleParameterChange,placeholder:e.defaultValue,rows:3,value:this.state.params[e.key]||""}):s.createElement("input",{disabled:u,name:e.key,onChange:this.handleParameterChange,placeholder:e.defaultValue,type:"text",value:this.state.params[e.key]||""}),s.createElement("div",{className:"note",dangerouslySetInnerHTML:{__html:e.htmlDesc||""}})))),s.createElement("footer",{className:"modal-foot"},u&&s.createElement("i",{className:"spinner spacer-right"}),s.createElement(i.SubmitButton,{disabled:u||b},E?Object(d.translate)("save"):Object(d.translate)("coding_rules.activate")),s.createElement(i.ResetButtonLink,{disabled:u,onClick:this.props.onClose},Object(d.translate)("cancel")))))}}},380:function(e,t,a){"use strict";a.d(t,"a",function(){return r});var n=a(2),s=a(450),i=a.n(s),l=a(5);function r(e){let t=e.className,a=e.severity;return a?n.createElement("span",{className:t},n.createElement(i.a,{className:"little-spacer-right",severity:a}),Object(l.translate)("severity",a)):null}},465:function(e,t,a){var n;
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
!function(){"use strict";var s=!("undefined"==typeof window||!window.document||!window.document.createElement),i={canUseDOM:s,canUseWorkers:"undefined"!=typeof Worker,canUseEventListeners:s&&!(!window.addEventListener&&!window.attachEvent),canUseViewport:s&&!!window.screen};void 0===(n=function(){return i}.call(t,a,t,e))||(e.exports=n)}()}}]);
//# sourceMappingURL=361.m.57dd3e80.chunk.js.map