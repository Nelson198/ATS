(window.webpackJsonp=window.webpackJsonp||[]).push([[338],{2130:function(e,t,n){"use strict";n.r(t);var r,o=n(12),i=n(159),a=n(683),c=n(788),l=n(668),u=n.n(l),s=n(34),p=(r=function(e,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}r(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)}),f=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.handleChange=function(e){t.props.onCompare(e.value)},t}return p(t,e),t.prototype.render=function(){var e=this.props,t=e.profile,n=e.profiles,r=e.withKey,i=n.filter(function(e){return e.language===t.language&&e!==t}).map(function(e){return{value:e.key,label:e.name}});return o.createElement("div",{className:"display-inline-block"},o.createElement("label",{className:"spacer-right"},Object(s.translate)("quality_profiles.compare_with")),o.createElement(u.a,{className:"input-large",clearable:!1,onChange:this.handleChange,options:i,placeholder:Object(s.translate)("select_verb"),value:r}))},t}(o.PureComponent),h=n(814),d=n.n(h),m=n(748),y=n.n(m),g=n(774),O=n.n(g),v=n(649);function b(){return o.createElement("div",{className:"big-spacer-top"},Object(s.translate)("quality_profile.empty_comparison"))}var j=n(640),_=n(650),E=n(645),N=n.n(E),z=n(725),q=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),k=Object(_.lazyLoad)(function(){return Promise.all([n.e(1),n.e(362)]).then(n.bind(null,1458))},"ActivationFormModal"),P=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={state:"closed"},t.handleButtonClick=function(){t.setState({state:"opening"}),Object(z.c)({key:t.props.ruleKey,organization:t.props.organization}).then(function(e){var n=e.rule;t.mounted&&t.setState({rule:n,state:"open"})},function(){t.mounted&&t.setState({state:"closed"})})},t.handleCloseModal=function(){t.setState({state:"closed"})},t}return q(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.isOpen=function(e){return"open"===e.state},t.prototype.render=function(){var e=this.props.profile;return!e.isBuiltIn&&e.actions&&e.actions.edit?o.createElement(N.a,{loading:"opening"===this.state.state},o.createElement(j.Button,{disabled:"closed"!==this.state.state,onClick:this.handleButtonClick},this.props.children),this.isOpen(this.state)&&o.createElement(k,{modalHeader:Object(s.translate)("coding_rules.activate_in_quality_profile"),onClose:this.handleCloseModal,onDone:this.props.onDone,organization:this.props.organization,profiles:[e],rule:this.state.rule})):null},t}(o.PureComponent),S=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),w=function(e){function t(){return null!==e&&e.apply(this,arguments)||this}return S(t,e),t.prototype.renderRule=function(e,t){return o.createElement("div",null,o.createElement(O.a,{severity:t})," ",o.createElement(i.Link,{to:Object(v.y)({rule_key:e.key,open:e.key},this.props.organization)},e.name))},t.prototype.renderParameters=function(e){return e?o.createElement("ul",null,Object.keys(e).map(function(t){return o.createElement("li",{className:"spacer-top",key:t},o.createElement("code",null,t,": ",e[t]))})):null},t.prototype.renderLeft=function(){var e=this;return 0===this.props.inLeft.length?null:o.createElement(o.Fragment,null,o.createElement("tr",null,o.createElement("td",null,o.createElement("h6",null,Object(s.translateWithParameters)("quality_profiles.x_rules_only_in",this.props.inLeft.length)," ",this.props.left.name)),o.createElement("td",null," ")),this.props.inLeft.map(function(t){return o.createElement("tr",{className:"js-comparison-in-left",key:"left-"+t.key},o.createElement("td",null,e.renderRule(t,t.severity)),o.createElement("td",null,e.props.rightProfile&&o.createElement(P,{key:t.key,onDone:e.props.refresh,organization:e.props.organization||void 0,profile:e.props.rightProfile,ruleKey:t.key},o.createElement(y.a,null))))}))},t.prototype.renderRight=function(){var e=this;return 0===this.props.inRight.length?null:o.createElement(o.Fragment,null,o.createElement("tr",null,o.createElement("td",null," "),o.createElement("td",null,o.createElement("h6",null,Object(s.translateWithParameters)("quality_profiles.x_rules_only_in",this.props.inRight.length)," ",this.props.right.name))),this.props.inRight.map(function(t){return o.createElement("tr",{className:"js-comparison-in-right",key:"right-"+t.key},o.createElement("td",{className:"text-right"},o.createElement(P,{key:t.key,onDone:e.props.refresh,organization:e.props.organization||void 0,profile:e.props.leftProfile,ruleKey:t.key},o.createElement(d.a,null))),o.createElement("td",null,e.renderRule(t,t.severity)))}))},t.prototype.renderModified=function(){var e=this;return 0===this.props.modified.length?null:o.createElement(o.Fragment,null,o.createElement("tr",null,o.createElement("td",{className:"text-center",colSpan:2},o.createElement("h6",null,Object(s.translateWithParameters)("quality_profiles.x_rules_have_different_configuration",this.props.modified.length)))),o.createElement("tr",null,o.createElement("td",null,o.createElement("h6",null,this.props.left.name)),o.createElement("td",null,o.createElement("h6",null,this.props.right.name))),this.props.modified.map(function(t){return o.createElement("tr",{className:"js-comparison-modified",key:"modified-"+t.key},o.createElement("td",null,e.renderRule(t,t.left.severity),e.renderParameters(t.left.params)),o.createElement("td",null,e.renderRule(t,t.right.severity),e.renderParameters(t.right.params)))}))},t.prototype.render=function(){return this.props.inLeft.length||this.props.inRight.length||this.props.modified.length?o.createElement("table",{className:"data zebra quality-profile-comparison-table"},o.createElement("tbody",null,this.renderLeft(),this.renderRight(),this.renderModified())):o.createElement(b,null)},t}(o.PureComponent),R=function(){var e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(t,n)};return function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}(),J=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!1},t.loadResults=function(){var e=t.props.location.query.withKey;return e?(t.setState({loading:!0}),Object(a.h)(t.props.profile.key,e).then(function(e){var n=e.left,r=e.right,o=e.inLeft,i=e.inRight,a=e.modified;t.mounted&&t.setState({left:n,right:r,inLeft:o,inRight:i,modified:a,loading:!1})},function(){t.mounted&&t.setState({loading:!1})})):(t.setState({left:void 0,loading:!1}),Promise.resolve())},t.handleCompare=function(e){var n=Object(c.b)(t.props.profile.name,t.props.profile.language,t.props.organization,e);t.props.router.push(n)},t}return R(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.loadResults()},t.prototype.componentDidUpdate=function(e){e.profile===this.props.profile&&e.location===this.props.location||this.loadResults()},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.hasResults=function(e){return void 0!==e.left},t.prototype.render=function(){var e=this.props,t=e.profile,n=e.profiles,r=e.location.query.withKey;return o.createElement("div",{className:"boxed-group boxed-group-inner js-profile-comparison"},o.createElement("header",null,o.createElement(f,{onCompare:this.handleCompare,profile:t,profiles:n,withKey:r}),this.state.loading&&o.createElement("i",{className:"spinner spacer-left"})),this.hasResults(this.state)&&o.createElement("div",{className:"spacer-top"},o.createElement(w,{inLeft:this.state.inLeft,inRight:this.state.inRight,left:this.state.left,leftProfile:t,modified:this.state.modified,organization:this.props.organization,refresh:this.loadResults,right:this.state.right,rightProfile:n.find(function(e){return e.key===r})})))},t}(o.PureComponent);t.default=Object(i.withRouter)(J)},683:function(e,t,n){"use strict";n.d(t,"y",function(){return u}),n.d(t,"s",function(){return s}),n.d(t,"j",function(){return p}),n.d(t,"w",function(){return f}),n.d(t,"r",function(){return h}),n.d(t,"q",function(){return d}),n.d(t,"A",function(){return m}),n.d(t,"v",function(){return y}),n.d(t,"i",function(){return g}),n.d(t,"l",function(){return O}),n.d(t,"g",function(){return v}),n.d(t,"o",function(){return b}),n.d(t,"n",function(){return j}),n.d(t,"p",function(){return _}),n.d(t,"h",function(){return E}),n.d(t,"d",function(){return N}),n.d(t,"m",function(){return z}),n.d(t,"z",function(){return q}),n.d(t,"x",function(){return k}),n.d(t,"c",function(){return P}),n.d(t,"u",function(){return S}),n.d(t,"b",function(){return w}),n.d(t,"t",function(){return R}),n.d(t,"e",function(){return J}),n.d(t,"f",function(){return C}),n.d(t,"a",function(){return L}),n.d(t,"k",function(){return M});var r=n(684),o=n.n(r),i=n(796),a=n(48),c=n(651),l=function(){return(l=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)};function u(e){return Object(a.getJSON)("/api/qualityprofiles/search",e).catch(c.a)}function s(e){return Object(a.getJSON)("/api/qualityprofiles/show",e)}function p(e){return Object(a.postJSON)("/api/qualityprofiles/create",e).catch(c.a)}function f(e){return Object(a.postJSON)("/api/qualityprofiles/restore",e).catch(c.a)}function h(e){return Object(a.getJSON)("/api/qualityprofiles/projects",e).catch(c.a)}function d(e){return Object(a.getJSON)("/api/qualityprofiles/inheritance",{profileKey:e}).catch(c.a)}function m(e){return Object(a.post)("/api/qualityprofiles/set_default",{profileKey:e})}function y(e,t){return Object(a.post)("/api/qualityprofiles/rename",{key:e,name:t}).catch(c.a)}function g(e,t){return Object(a.postJSON)("/api/qualityprofiles/copy",{fromKey:e,toName:t}).catch(c.a)}function O(e){return Object(a.post)("/api/qualityprofiles/delete",{profileKey:e}).catch(c.a)}function v(e,t){return Object(a.post)("/api/qualityprofiles/change_parent",{profileKey:e,parentKey:t}).catch(c.a)}function b(){return Object(a.getJSON)("/api/qualityprofiles/importers").then(function(e){return e.importers},c.a)}function j(){return Object(a.getJSON)("/api/qualityprofiles/exporters").then(function(e){return e.exporters})}function _(e){return Object(a.getJSON)("/api/qualityprofiles/changelog",e)}function E(e,t){return Object(a.getJSON)("/api/qualityprofiles/compare",{leftKey:e,rightKey:t})}function N(e,t){return Object(a.post)("/api/qualityprofiles/add_project",{key:e,project:t}).catch(c.a)}function z(e,t){return Object(a.post)("/api/qualityprofiles/remove_project",{key:e,project:t}).catch(c.a)}function q(e){return Object(a.getJSON)("/api/qualityprofiles/search_users",e).catch(c.a)}function k(e){return Object(a.getJSON)("/api/qualityprofiles/search_groups",e).catch(c.a)}function P(e){return Object(a.post)("/api/qualityprofiles/add_user",e).catch(c.a)}function S(e){return Object(a.post)("/api/qualityprofiles/remove_user",e).catch(c.a)}function w(e){return Object(a.post)("/api/qualityprofiles/add_group",e).catch(c.a)}function R(e){return Object(a.post)("/api/qualityprofiles/remove_group",e).catch(c.a)}function J(e){return Object(a.postJSON)("/api/qualityprofiles/activate_rules",e)}function C(e){return Object(a.postJSON)("/api/qualityprofiles/deactivate_rules",e)}function L(e){var t=e.params&&o()(e.params,function(e,t){return t+"="+Object(i.csvEscape)(e)}).join(";");return Object(a.post)("/api/qualityprofiles/activate_rule",l({},e,{params:t})).catch(c.a)}function M(e){return Object(a.post)("/api/qualityprofiles/deactivate_rule",e).catch(c.a)}},684:function(e,t,n){var r=n(700),o=n(670),i=n(753),a=n(685);e.exports=function(e,t){return(a(e)?r:i)(e,o(t,3))}},725:function(e,t,n){"use strict";n.d(t,"e",function(){return i}),n.d(t,"f",function(){return a}),n.d(t,"g",function(){return c}),n.d(t,"c",function(){return l}),n.d(t,"d",function(){return u}),n.d(t,"a",function(){return s}),n.d(t,"b",function(){return p}),n.d(t,"h",function(){return f});var r=n(48),o=n(651);function i(e){return Object(r.getJSON)("/api/rules/app",e).catch(o.a)}function a(e){return Object(r.getJSON)("/api/rules/search",e).catch(o.a)}function c(e,t){var n=e.facets.find(function(e){return e.property===t});return n?n.values:[]}function l(e){return Object(r.getJSON)("/api/rules/show",e).catch(o.a)}function u(e){return Object(r.getJSON)("/api/rules/tags",e).then(function(e){return e.tags},o.a)}function s(e){return Object(r.postJSON)("/api/rules/create",e).then(function(e){return e.rule},function(e){return e&&409===e.status?Promise.reject(e):Object(o.a)(e)})}function p(e){return Object(r.post)("/api/rules/delete",e).catch(o.a)}function f(e){return Object(r.postJSON)("/api/rules/update",e).then(function(e){return e.rule},o.a)}},774:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=n(12),o=n(641),i={blocker:function(e){var t=e.className,n=e.size;return r.createElement(o.ThemedIcon,{className:t,size:n},function(e){var t=e.theme;return r.createElement("path",{d:"M8 14c-3.311 0-6-2.689-6-6s2.689-6 6-6 6 2.689 6 6-2.689 6-6 6zM7 9h2V4H7v5zm0 3h2v-2H7v2z",style:{fill:t.colors.red,fillRule:"nonzero"}})})},critical:function(e){var t=e.className,n=e.size;return r.createElement(o.ThemedIcon,{className:t,size:n},function(e){var t=e.theme;return r.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm1 10V7.414l1.893 1.893c.13.124.282.216.457.261a1.006 1.006 0 0 0 1.176-.591 1.01 1.01 0 0 0 .01-.729 1.052 1.052 0 0 0-.229-.355c-1.212-1.212-2.394-2.456-3.638-3.636a1.073 1.073 0 0 0-.169-.123 1.05 1.05 0 0 0-.448-.133h-.104a1.053 1.053 0 0 0-.493.16 1.212 1.212 0 0 0-.162.132C6.08 5.505 4.836 6.687 3.656 7.932a.994.994 0 0 0-.051 1.275c.208.271.548.42.888.389.198-.019.378-.098.535-.218.041-.035.04-.034.079-.071L7 7.414V12h2z",style:{fill:t.colors.red,fillRule:"nonzero"}})})},major:function(e){var t=e.className,n=e.size;return r.createElement(o.ThemedIcon,{className:t,size:n},function(e){var t=e.theme;return r.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm.08 2.903c.071.008.14.019.208.039.138.042.26.114.37.205 1.244 1.146 2.426 2.357 3.639 3.536.1.103.181.218.234.352a1.01 1.01 0 0 1 .001.728 1.002 1.002 0 0 1-1.169.609 1.042 1.042 0 0 1-.46-.255L8 7.295l-2.903 2.822c-.039.036-.039.036-.08.07a1.002 1.002 0 0 1-1.604-.947c.032-.196.122-.37.253-.519C4.847 7.51 6.09 6.362 7.303 5.183c.052-.048.106-.093.167-.131a1.041 1.041 0 0 1 .61-.149z",style:{fill:t.colors.red}})})},minor:function(e){var t=e.className,n=e.size;return r.createElement(o.ThemedIcon,{className:t,size:n},function(e){var t=e.theme;return r.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm1 6.586V4H7v4.586L5.107 6.693a1.178 1.178 0 0 0-.165-.134 1.041 1.041 0 0 0-.662-.152 1 1 0 0 0-.587 1.7c1.212 1.212 2.394 2.456 3.638 3.636.094.08.195.146.311.191a1.008 1.008 0 0 0 1.065-.227c1.213-1.212 2.457-2.394 3.637-3.639a.994.994 0 0 0 .051-1.275 1.012 1.012 0 0 0-.888-.389 1.041 1.041 0 0 0-.535.218c-.04.034-.04.034-.079.071L9 8.586z",style:{fill:t.colors.lightGreen}})})},info:function(e){var t=e.className,n=e.size;return r.createElement(o.ThemedIcon,{className:t,size:n},function(e){var t=e.theme;return r.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm1 5H7v5h2V7zm0-3H7v2h2V4z",style:{fill:t.colors.blue}})})}};t.default=function(e){if(!e.severity)return null;var t=e.severity.toLowerCase(),n=i[t];return n?r.createElement(n,{className:e.className}):null}},796:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.csvEscape=function(e){return'"'+e.replace(/"/g,'\\"')+'"'}},814:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=n(12),o=n(641);t.default=function(e){var t=e.className,n=e.fill,i=void 0===n?"currentColor":n,a=e.size;return r.createElement(o.default,{className:t,size:a},r.createElement("path",{d:"M4.404 8.28l4.604 4.602a.382.382 0 0 0 .279.118c.108 0 .2-.04.279-.118l1.03-1.03a.382.382 0 0 0 .117-.278.382.382 0 0 0-.117-.28L7.3 8l3.295-3.294a.382.382 0 0 0 .117-.28.382.382 0 0 0-.117-.279l-1.03-1.03A.382.382 0 0 0 9.286 3a.382.382 0 0 0-.278.118L4.404 7.72A.382.382 0 0 0 4.287 8c0 .108.04.201.117.28z",style:{fill:i}}))}}}]);
//# sourceMappingURL=338.1570825310815.chunk.js.map