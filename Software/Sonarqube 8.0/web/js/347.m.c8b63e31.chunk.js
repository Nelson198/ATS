(window.webpackJsonp=window.webpackJsonp||[]).push([[347,22,372],{1124:function(e,t,n){"use strict";n.r(t);var a=n(2),s=n(316),o=n(317),i=n(413),r=n(511);t.default=Object(s.connect)(e=>({globalPages:Object(o.getAppState)(e).globalPages}))(function(e){const t=e.params,n=t.extensionKey,s=t.pluginKey,o=(e.globalPages||[]).find(e=>e.key==="".concat(s,"/").concat(n));return o?a.createElement(r.a,{extension:o}):a.createElement(i.default,{withContainer:!1})})},383:function(e,t,n){"use strict";n.d(t,"b",function(){return i}),n.d(t,"a",function(){return r});var a=n(322),s=n(14);let o=!1;function i(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"body";return new Promise(n=>{const s=document.createElement("script");s.src="".concat(Object(a.getBaseUrl)()).concat(e),s.onload=n,document.getElementsByTagName(t)[0].appendChild(s)})}async function r(e){const t=Object(s.a)(e);if(t)return Promise.resolve(t);if(!o){(0,(await Promise.all([n.e(0),n.e(1),n.e(2),n.e(4),n.e(281)]).then(n.bind(null,507))).default)(),o=!0}await i("/static/".concat(e,".js"));const a=Object(s.a)(e);return a||Promise.reject()}},401:function(e,t,n){"use strict";n.r(t),n.d(t,"default",function(){return c});var a=n(2),s=n(433),o=n.n(s),i=n(334),r=n(494);function c(e){let t=e.children;return a.createElement("div",{className:"global-container"},a.createElement("div",{className:"page-wrapper",id:"container"},a.createElement(o.a,{className:"navbar-global",height:i.rawSizes.globalNavHeightRaw}),t),a.createElement(r.a,null))}},413:function(e,t,n){"use strict";n.r(t),n.d(t,"default",function(){return c});var a=n(2),s=n(325),o=n(28),i=n(5),r=n(401);function c(e){let t=e.withContainer;const n=void 0===t||t?r.default:a.Fragment;return a.createElement(n,null,a.createElement(s.Helmet,{defaultTitle:Object(i.translate)("404_not_found"),defer:!1}),a.createElement("div",{className:"page-wrapper-simple",id:"bd"},a.createElement("div",{className:"page-simple",id:"nonav"},a.createElement("h2",{className:"big-spacer-bottom"},Object(i.translate)("page_not_found")),a.createElement("p",{className:"spacer-bottom"},Object(i.translate)("address_mistyped_or_page_moved")),a.createElement("p",null,a.createElement(o.Link,{to:"/"},Object(i.translate)("go_back_to_homepage"))))))}},511:function(e,t,n){"use strict";var a=n(2),s=n(325),o=n.n(s),i=n(304),r=n(316),c=n(5),l=n(347),p=n(383),u=n(378),d=n(317),m=n(334),h=n(381);const b={onFail:u.a};t.a=Object(i.injectIntl)(Object(l.a)(Object(r.connect)(e=>({currentUser:Object(d.getCurrentUser)(e)}),b)(class extends a.PureComponent{constructor(){super(...arguments),this.state={},this.handleStart=e=>{const t=Object(h.default)(),n=e(Object.assign({store:t,el:this.container,currentUser:this.props.currentUser,intl:this.props.intl,location:this.props.location,router:this.props.router,theme:m},this.props.options));a.isValidElement(n)?this.setState({extensionElement:n}):this.stop=n},this.handleFailure=()=>{this.props.onFail(Object(c.translate)("page_extension_failed"))}}componentDidMount(){this.startExtension()}componentDidUpdate(e){e.extension!==this.props.extension?(this.stopExtension(),this.startExtension()):e.location!==this.props.location&&this.startExtension()}componentWillUnmount(){this.stopExtension()}startExtension(){Object(p.a)(this.props.extension.key).then(this.handleStart,this.handleFailure)}stopExtension(){this.stop?(this.stop(),this.stop=void 0):this.setState({extensionElement:void 0})}render(){return a.createElement("div",null,a.createElement(o.a,{title:this.props.extension.name}),this.state.extensionElement?this.state.extensionElement:a.createElement("div",{ref:e=>this.container=e}))}})))}}]);
//# sourceMappingURL=347.m.c8b63e31.chunk.js.map