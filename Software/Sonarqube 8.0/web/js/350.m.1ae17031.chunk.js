(window.webpackJsonp=window.webpackJsonp||[]).push([[350,22,372],{1736:function(e,t,n){"use strict";n.r(t),n.d(t,"default",function(){return i});var s=n(2),a=n(413),o=n(511);function i(e){const t=e.params,n=t.extensionKey,i=t.pluginKey,r=e.component,c=r.extensions&&r.extensions.find(e=>e.key==="".concat(i,"/").concat(n));return c?s.createElement(o.a,{extension:c,options:{component:r}}):s.createElement(a.default,{withContainer:!1})}},383:function(e,t,n){"use strict";n.d(t,"b",function(){return i}),n.d(t,"a",function(){return r});var s=n(322),a=n(14);let o=!1;function i(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"body";return new Promise(n=>{const a=document.createElement("script");a.src="".concat(Object(s.getBaseUrl)()).concat(e),a.onload=n,document.getElementsByTagName(t)[0].appendChild(a)})}async function r(e){const t=Object(a.a)(e);if(t)return Promise.resolve(t);if(!o){(0,(await Promise.all([n.e(0),n.e(1),n.e(2),n.e(4),n.e(281)]).then(n.bind(null,507))).default)(),o=!0}await i("/static/".concat(e,".js"));const s=Object(a.a)(e);return s||Promise.reject()}},401:function(e,t,n){"use strict";n.r(t),n.d(t,"default",function(){return c});var s=n(2),a=n(433),o=n.n(a),i=n(334),r=n(494);function c(e){let t=e.children;return s.createElement("div",{className:"global-container"},s.createElement("div",{className:"page-wrapper",id:"container"},s.createElement(o.a,{className:"navbar-global",height:i.rawSizes.globalNavHeightRaw}),t),s.createElement(r.a,null))}},413:function(e,t,n){"use strict";n.r(t),n.d(t,"default",function(){return c});var s=n(2),a=n(325),o=n(28),i=n(5),r=n(401);function c(e){let t=e.withContainer;const n=void 0===t||t?r.default:s.Fragment;return s.createElement(n,null,s.createElement(a.Helmet,{defaultTitle:Object(i.translate)("404_not_found"),defer:!1}),s.createElement("div",{className:"page-wrapper-simple",id:"bd"},s.createElement("div",{className:"page-simple",id:"nonav"},s.createElement("h2",{className:"big-spacer-bottom"},Object(i.translate)("page_not_found")),s.createElement("p",{className:"spacer-bottom"},Object(i.translate)("address_mistyped_or_page_moved")),s.createElement("p",null,s.createElement(o.Link,{to:"/"},Object(i.translate)("go_back_to_homepage"))))))}},511:function(e,t,n){"use strict";var s=n(2),a=n(325),o=n.n(a),i=n(304),r=n(316),c=n(5),l=n(347),p=n(383),u=n(378),m=n(317),d=n(334),h=n(381);const f={onFail:u.a};t.a=Object(i.injectIntl)(Object(l.a)(Object(r.connect)(e=>({currentUser:Object(m.getCurrentUser)(e)}),f)(class extends s.PureComponent{constructor(){super(...arguments),this.state={},this.handleStart=e=>{const t=Object(h.default)(),n=e(Object.assign({store:t,el:this.container,currentUser:this.props.currentUser,intl:this.props.intl,location:this.props.location,router:this.props.router,theme:d},this.props.options));s.isValidElement(n)?this.setState({extensionElement:n}):this.stop=n},this.handleFailure=()=>{this.props.onFail(Object(c.translate)("page_extension_failed"))}}componentDidMount(){this.startExtension()}componentDidUpdate(e){e.extension!==this.props.extension?(this.stopExtension(),this.startExtension()):e.location!==this.props.location&&this.startExtension()}componentWillUnmount(){this.stopExtension()}startExtension(){Object(p.a)(this.props.extension.key).then(this.handleStart,this.handleFailure)}stopExtension(){this.stop?(this.stop(),this.stop=void 0):this.setState({extensionElement:void 0})}render(){return s.createElement("div",null,s.createElement(o.a,{title:this.props.extension.name}),this.state.extensionElement?this.state.extensionElement:s.createElement("div",{ref:e=>this.container=e}))}})))}}]);
//# sourceMappingURL=350.m.1ae17031.chunk.js.map