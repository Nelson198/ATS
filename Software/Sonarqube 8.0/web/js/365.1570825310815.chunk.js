(window.webpackJsonp=window.webpackJsonp||[]).push([[365],{2080:function(n,t,o){"use strict";o.r(t),o.d(t,"OrganizationAccess",function(){return f}),o.d(t,"hasAdminAccess",function(){return l}),o.d(t,"default",function(){return d});var r,e=o(12),c=o(646),i=o(903),s=o(659),a=o(647),u=(r=function(n,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(n,t){n.__proto__=t}||function(n,t){for(var o in t)t.hasOwnProperty(o)&&(n[o]=t[o])})(n,t)},function(n,t){function o(){this.constructor=n}r(n,t),n.prototype=null===t?Object.create(t):(o.prototype=t.prototype,new o)}),p=function(){return(p=Object.assign||function(n){for(var t,o=1,r=arguments.length;o<r;o++)for(var e in t=arguments[o])Object.prototype.hasOwnProperty.call(t,e)&&(n[e]=t[e]);return n}).apply(this,arguments)},f=function(n){function t(){var t=null!==n&&n.apply(this,arguments)||this;return t.checkPermissions=function(){t.props.hasAccess(t.props)||Object(i.a)()},t}return u(t,n),t.prototype.componentDidMount=function(){this.checkPermissions()},t.prototype.componentDidUpdate=function(){this.checkPermissions()},t.prototype.render=function(){return this.props.hasAccess(this.props)?e.cloneElement(this.props.children,{location:this.props.location,organization:this.props.organization}):null},t}(e.PureComponent),h=Object(c.connect)(function(n,t){return{currentUser:Object(a.getCurrentUser)(n),organization:Object(a.getOrganizationByKey)(n,t.params.organizationKey)}})(f);function l(n){var t=n.currentUser,o=n.organization;return Boolean(Object(s.b)(t)&&o&&o.actions&&o.actions.admin)}function d(n){return e.createElement(h,p({hasAccess:l},n))}},903:function(n,t,o){"use strict";o.d(t,"a",function(){return s});var r=o(165),e=o.n(r),c=o(872),i=o(711);function s(){var n=Object(i.default)(),t=e()(),o=window.location.pathname+window.location.search+window.location.hash;n.dispatch(Object(c.c)()),t.replace({pathname:"/sessions/new",query:{return_to:o}})}}}]);
//# sourceMappingURL=365.1570825310815.chunk.js.map