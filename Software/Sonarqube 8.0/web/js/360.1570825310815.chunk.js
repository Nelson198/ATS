(window.webpackJsonp=window.webpackJsonp||[]).push([[360],{2067:function(t,n,o){"use strict";o.r(n);var e,r=o(12),i=o(903),c=o(673),p=(e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var o in n)n.hasOwnProperty(o)&&(t[o]=n[o])})(t,n)},function(t,n){function o(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(o.prototype=n.prototype,new o)}),u=function(t,n){var o={};for(var e in t)Object.prototype.hasOwnProperty.call(t,e)&&n.indexOf(e)<0&&(o[e]=t[e]);if(null!=t&&"function"==typeof Object.getOwnPropertySymbols){var r=0;for(e=Object.getOwnPropertySymbols(t);r<e.length;r++)n.indexOf(e[r])<0&&(o[e[r]]=t[e[r]])}return o},a=function(t){function n(){return null!==t&&t.apply(this,arguments)||this}return p(n,t),n.prototype.componentDidMount=function(){this.checkPermissions()},n.prototype.componentDidUpdate=function(){this.checkPermissions()},n.prototype.checkPermissions=function(){this.isProjectAdmin()||Object(i.a)()},n.prototype.isProjectAdmin=function(){var t=this.props.component.configuration;return null!=t&&t.showSettings},n.prototype.render=function(){if(!this.isProjectAdmin())return null;var t=this.props,n=t.children,o=u(t,["children"]);return r.createElement(r.Fragment,null,r.createElement(c.a,{anchor:"admin_main"}),r.cloneElement(n,o))},n}(r.PureComponent);n.default=a},673:function(t,n,o){"use strict";o.d(n,"a",function(){return a});var e,r=o(12),i=o(34),c=o(729),p=(e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var o in n)n.hasOwnProperty(o)&&(t[o]=n[o])})(t,n)},function(t,n){function o(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(o.prototype=n.prototype,new o)}),u=function(){return(u=Object.assign||function(t){for(var n,o=1,e=arguments.length;o<e;o++)for(var r in n=arguments[o])Object.prototype.hasOwnProperty.call(n,r)&&(t[r]=n[r]);return t}).apply(this,arguments)};function a(t){return r.createElement(c.a.Consumer,null,function(n){var o=n.addA11ySkipLink,e=n.removeA11ySkipLink;return r.createElement(s,u({addA11ySkipLink:o,removeA11ySkipLink:e},t))})}var s=function(t){function n(){var n=null!==t&&t.apply(this,arguments)||this;return n.getLink=function(){var t=n.props,o=t.anchor,e=t.label;return{key:o,label:void 0===e?Object(i.translate)("skip_to_content"):e,weight:t.weight}},n}return p(n,t),n.prototype.componentDidMount=function(){this.props.addA11ySkipLink(this.getLink())},n.prototype.componentWillUnmount=function(){this.props.removeA11ySkipLink(this.getLink())},n.prototype.render=function(){var t=this.props.anchor;return r.createElement("span",{id:"a11y_target__"+t})},n}(r.PureComponent)},903:function(t,n,o){"use strict";o.d(n,"a",function(){return p});var e=o(165),r=o.n(e),i=o(872),c=o(711);function p(){var t=Object(c.default)(),n=r()(),o=window.location.pathname+window.location.search+window.location.hash;t.dispatch(Object(i.c)()),n.replace({pathname:"/sessions/new",query:{return_to:o}})}}}]);
//# sourceMappingURL=360.1570825310815.chunk.js.map