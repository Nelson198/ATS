(window.webpackJsonp=window.webpackJsonp||[]).push([[296],{1047:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r(12),n=r(641);t.default=function(e){var t=e.className,r=e.fill,o=void 0===r?"currentColor":r,i=e.size;return a.createElement(n.default,{className:t,size:i},a.createElement("path",{d:"M14.7 3.4v3.3c0 .1 0 .2-.1.2s-.2 0-.3-.1l-.9-.9-4.8 4.8c-.1.1-.1.1-.2.1s-.1 0-.2-.1L6.4 9l-3.2 3.2-1.5-1.5 4.5-4.5c.1-.1.1-.1.2-.1s.1 0 .2.1L8.4 8l3.5-3.5-.9-1c-.1-.1-.1-.2-.1-.3s.1-.1.2-.1h3.3c.1 0 .1 0 .2.1.1 0 .1.1.1.2z",style:{fill:o}}))}},1263:function(e,t,r){var a=r(887),n=r(971),o=r(945);e.exports=function(e){return e&&e.length?a(e,o,n):void 0}},1991:function(e,t,r){var a=r(1992);"string"==typeof a&&(a=[[e.i,a,""]]);var n={hmr:!0,transform:void 0,insertInto:void 0};r(643)(a,n);a.locals&&(e.exports=a.locals)},1992:function(e,t,r){(e.exports=r(642)(!1)).push([e.i,".portfolio-overview>h1{font-weight:400}.portfolio-overview>.page-actions{margin-bottom:0}.portfolio-measure-secondary-value{line-height:24px;font-size:18px;font-weight:300}.portfolio-grid{position:relative;z-index:10;display:flex;justify-content:space-around;align-items:center}.portfolio-grid>li{vertical-align:top;width:50%;text-align:center}.portfolio-grid>li.text-middle{vertical-align:middle}.portfolio-freshness{line-height:24px;white-space:nowrap}.portfolio-boxes{display:flex;justify-content:space-between;align-items:stretch;margin-bottom:20px;padding:15px 0;width:100%}.portfolio-box{flex:1 0 10%;position:relative;padding:0 16px 66px;margin:0 8px;border:1px solid #e6e6e6;background-color:#fff;box-sizing:border-box}.portfolio-box:first-child{margin-left:0}.portfolio-box:last-child{margin-right:0}.portfolio-box-title{padding:8px 0 16px;margin:8px 0 16px;font-size:16px;line-height:16px;border-bottom:1px solid #e6e6e6;white-space:nowrap}.portfolio-box-title>.button-small>svg{margin-top:0}.portfolio-box>h3{color:#777;font-size:12px;font-weight:400;margin-top:8px}.portfolio-box-rating,.portfolio-box-rating .rating{display:block;width:80px;height:80px;line-height:80px}.portfolio-box-rating{margin:16px auto;border:none}.portfolio-box-rating .rating{border-radius:80px;font-size:48px;text-align:center}.portfolio-box-rating .rating.no-rating{color:#777;font-size:16px}.portfolio-box-links{border-top:1px solid #e6e6e6;text-align:center;position:absolute;bottom:0;left:0;right:0}.portfolio-box-links>div{display:inline-block;padding:12px 0;width:50%;box-sizing:border-box}.portfolio-box-links>div:first-child{border-right:1px solid #e6e6e6}.portfolio-box-links a,.portfolio-breakdown-box-link a{border:none}.portfolio-box-links svg,.portfolio-breakdown-box-link svg{vertical-align:middle}.portfolio-box-links a>span,.portfolio-breakdown-box-link a>span{border-bottom:1px solid #cae3f2}.portfolio-breakdown{display:flex}.portfolio-breakdown-box{flex:0 0 auto;display:flex;flex-direction:column;background-color:#fff;border:1px solid #e6e6e6;margin:8px 0 16px}.portfolio-breakdown-box+.portfolio-breakdown-box{margin-left:16px}.portfolio-breakdown-box .portfolio-breakdown-metric,.portfolio-breakdown-box h2{margin:8px 16px 0}.portfolio-breakdown-box-link{margin-top:16px;border-top:1px solid #e6e6e6;padding:16px}.portfolio-sub-components table.data th{font-size:13px;text-transform:none;vertical-align:middle}.portfolio-sub-components-cell{width:110px}.portfolio-meta-header{margin-bottom:4px;color:#444}.portfolio-meta-card{min-width:200px;box-sizing:border-box}.portfolio-meta-card+.portfolio-meta-card{margin-top:16px;padding-top:15px;border-top:1px solid #e6e6e6}",""])},1993:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r(12),n=r(641);t.default=function(e){var t=e.className,r=e.fill,o=void 0===r?"currentColor":r,i=e.size;return a.createElement(n.default,{className:t,size:i,style:{fillRule:"nonzero"}},a.createElement("path",{d:"M3.33 6.13h2v6.54h-2zm3.74-2.8h1.86v9.34H7.07zm3.73 5.34h1.87v4H10.8z",fill:o}))}},2111:function(e,t,r){"use strict";r.r(t);var a=r(12),n=r(646),o=r(34),i=r(686),l=r(892),c=r(744),s=r(738),m=r(647),u=(r(1991),["projects","ncloc","ncloc_language_distribution","releasability_rating","releasability_effort","sqale_rating","maintainability_rating_effort","reliability_rating","reliability_rating_effort","security_rating","security_rating_effort","security_review_rating","security_review_rating_effort","last_change_on_releasability_rating","last_change_on_maintainability_rating","last_change_on_security_rating","last_change_on_security_review_rating","last_change_on_reliability_rating"]),p={releasability:{measuresMetric:"Releasability",label:"metric_domain.Releasability",rating:"releasability_rating",effort:"releasability_effort",last_change:"last_change_on_releasability_rating"},reliability:{measuresMetric:"Reliability",label:"metric_domain.Reliability",rating:"reliability_rating",effort:"reliability_rating_effort",last_change:"last_change_on_reliability_rating"},vulnerabilities:{measuresMetric:"Security",label:"portfolio.metric_domain.vulnerabilities",rating:"security_rating",effort:"security_rating_effort",last_change:"last_change_on_security_rating",activity:"security_rating,vulnerabilities"},security_hotspots:{measuresMetric:"security_review_rating",label:"portfolio.metric_domain.security_hotspots",rating:"security_review_rating",effort:"security_review_rating_effort",last_change:"last_change_on_security_review_rating"},maintainability:{measuresMetric:"Maintainability",label:"metric_domain.Maintainability",rating:"sqale_rating",effort:"maintainability_rating_effort",last_change:"last_change_on_maintainability_rating"}},f=["ncloc","releasability_rating","security_rating","security_review_rating","reliability_rating","sqale_rating","alert_status"];function d(e){var t={};return e.forEach(function(e){t[e.metric]=e.value}),t}var b=r(159),h=r(1993),v=r.n(h),g=r(649);function _(e){var t=e.component,r=e.label,n=e.metric;return a.createElement(b.Link,{to:Object(g.e)({componentKey:t,metric:n})},a.createElement(v.a,{className:"little-spacer-right",size:14}),a.createElement("span",null,r||Object(o.translate)("portfolio.measures_link")))}var y=r(653),x=r.n(y),E=r(695),N=r.n(E),z=r(634),O=r(714),j=r.n(O);function w(e){var t=e.component,r=e.effort,n=e.metricKey;return a.createElement("div",{className:"portfolio-effort"},a.createElement(z.FormattedMessage,{defaultMessage:Object(o.translate)("portfolio.x_in_y"),id:"portfolio.x_in_y",values:{projects:a.createElement(b.Link,{to:Object(g.e)({componentKey:t,metric:n,listView:!0})},a.createElement("span",null,a.createElement(c.a,{className:"little-spacer-right",metricKey:"projects",metricType:"SHORT_INT",value:String(r.projects)}),1===r.projects?Object(o.translate)("project_singular"):Object(o.translate)("project_plural"))),rating:a.createElement(j.a,{small:!0,value:r.rating})}}))}var k=r(1047),M=r.n(k);function H(e){var t=e.component,r=e.metric;return a.createElement(b.Link,{to:Object(g.n)(t,r)},a.createElement(M.a,{className:"little-spacer-right",size:14}),a.createElement("span",null,Object(o.translate)("portfolio.activity_link")))}function V(e){var t=e.component,r=e.metric,n=e.value;return a.createElement(b.Link,{className:"portfolio-box-rating",to:Object(g.o)(t,r)},a.createElement(j.a,{value:n}))}var T=r(689);function S(e){var t=e.lastChange,r=e.rating;if(!t)return a.createElement("div",{className:"portfolio-freshness"},r&&a.createElement(z.FormattedMessage,{defaultMessage:Object(o.translate)("portfolio.has_always_been_x"),id:"portfolio.has_always_been_x",values:{rating:a.createElement(j.a,{small:!0,value:r})}}));var n=JSON.parse(t);return a.createElement("div",{className:"portfolio-freshness"},a.createElement(z.FormattedMessage,{defaultMessage:Object(o.translate)("portfolio.was_x_y"),id:"portfolio.was_x_y",values:{rating:a.createElement(j.a,{small:!0,value:n.value}),date:a.createElement(T.a,{date:n.date})}}))}function I(e){var t=e.component,r=e.measures,n=e.metricKey,i=p[n],l=r[i.rating],s=r[i.last_change],m=r[i.effort],u=m?JSON.parse(m):void 0;return a.createElement("div",{className:"portfolio-box"},a.createElement("h2",{className:"portfolio-box-title"},Object(o.translate)(i.label),a.createElement(x.a,{className:"little-spacer-left",overlay:Object(o.translate)("portfolio.metric_domain",n,"help")})),l?a.createElement(V,{component:t,metric:i.rating,value:l}):a.createElement("div",{className:"portfolio-box-rating"},a.createElement("span",{className:"rating no-rating"},"—")),l&&a.createElement(a.Fragment,null,a.createElement("h3",null,Object(o.translate)("portfolio.metric_trend")),a.createElement(S,{lastChange:s,rating:l})),"releasability"===n?Number(u)>0&&a.createElement(a.Fragment,null,a.createElement("h3",null,Object(o.translate)("portfolio.lowest_rated_projects")),a.createElement("div",{className:"portfolio-effort"},a.createElement(b.Link,{to:Object(g.e)({componentKey:t,metric:"alert_status"})},a.createElement("span",null,a.createElement(c.a,{className:"little-spacer-right",metricKey:"projects",metricType:"SHORT_INT",value:u}),1===Number(u)?Object(o.translate)("project_singular"):Object(o.translate)("project_plural")))," ",a.createElement(N.a,{level:"ERROR",small:!0}))):u&&a.createElement(a.Fragment,null,a.createElement("h3",null,Object(o.translate)("portfolio.lowest_rated_projects")),a.createElement(w,{component:t,effort:u,metricKey:i.rating})),a.createElement("div",{className:"portfolio-box-links"},a.createElement("div",null,a.createElement(_,{component:t,metric:i.measuresMetric})),a.createElement("div",null,a.createElement(H,{component:t,metric:i.activity||i.rating}))))}var R=r(640),C=r(658),P=r.n(C),K=r(663),L=r.n(K),A=r(48),q=r(651);function F(e){return window.baseUrl+"/api/governance_reports/download?componentKey="+encodeURIComponent(e)}var D,U=r(750),W=r(659),G=(D=function(e,t){return(D=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var r in t)t.hasOwnProperty(r)&&(e[r]=t[r])})(e,t)},function(e,t){function r(){this.constructor=e}D(e,t),e.prototype=null===t?Object.create(t):(r.prototype=t.prototype,new r)}),J=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.handleSubscription=function(e){Object(U.a)(e?Object(o.translateWithParameters)("report.subscribe_x_success",t.getFrequencyText()):Object(o.translateWithParameters)("report.unsubscribe_x_success",t.getFrequencyText())),t.props.onSubscribe()},t.handleSubscribe=function(){var e;(e=t.props.component,Object(A.post)("/api/governance_reports/subscribe",{componentKey:e}).catch(q.a)).then(function(){return t.handleSubscription(!0)}).catch(q.a)},t.handleUnsubscribe=function(){var e;(e=t.props.component,Object(A.post)("/api/governance_reports/unsubscribe",{componentKey:e}).catch(q.a)).then(function(){return t.handleSubscription(!1)}).catch(q.a)},t.getFrequencyText=function(){var e=t.props.status.componentFrequency||t.props.status.globalFrequency;return Object(o.translate)("report.frequency",e)},t}return G(t,e),t.prototype.render=function(){var e=Object(W.b)(this.props.currentUser)&&!!this.props.currentUser.email,t=this.props.status;return e?t.subscribed?a.createElement("a",{href:"#",onClick:this.handleUnsubscribe},Object(o.translateWithParameters)("report.unsubscribe_x",this.getFrequencyText())):a.createElement("a",{href:"#",onClick:this.handleSubscribe},Object(o.translateWithParameters)("report.subscribe_x",this.getFrequencyText())):a.createElement("span",{className:"text-muted-2"},Object(o.translate)("report.no_email_to_subscribe"))},t}(a.PureComponent),B=Object(n.connect)(function(e){return{currentUser:Object(m.getCurrentUser)(e)}})(J),X=function(){var e=function(t,r){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var r in t)t.hasOwnProperty(r)&&(e[r]=t[r])})(t,r)};return function(t,r){function a(){this.constructor=t}e(t,r),t.prototype=null===r?Object.create(r):(a.prototype=r.prototype,new a)}}(),Y=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!0},t.loadStatus=function(){var e;(e=t.props.component.key,Object(A.getJSON)("/api/governance_reports/status",{componentKey:e}).catch(q.a)).then(function(e){t.mounted&&t.setState({status:e,loading:!1})},function(){t.mounted&&t.setState({loading:!1})})},t}return X(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.loadStatus()},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this.props.component,t=this.state,r=t.status;return t.loading||!r?null:r.canSubscribe?a.createElement(P.a,{overlay:a.createElement("ul",{className:"menu"},a.createElement("li",null,a.createElement("a",{download:e.name+" - Executive Report.pdf",href:F(e.key),target:"_blank"},Object(o.translate)("report.print"))),a.createElement("li",null,a.createElement(B,{component:e.key,onSubscribe:this.loadStatus,status:r}))),tagName:"li"},a.createElement(R.Button,{className:"dropdown-toggle"},Object(o.translate)("portfolio.pdf_report"),a.createElement(L.a,{className:"spacer-left icon-half-transparent"}))):a.createElement("a",{className:"button",download:e.name+" - Executive Report.pdf",href:F(e.key),target:"_blank"},Object(o.translate)("report.print"))},t}(a.PureComponent),Q=r(1263),Z=r.n(Q),$=r(676),ee=r.n($),te=r(648),re=r(664);function ae(e){var t=e.component,r=e.subComponents,n=e.total,i=r.length;if(!i)return null;var l=Z()(r.map(function(e){return Number(e.measures.ncloc||0)})),s={pathname:"/code",query:{id:t}};return a.createElement("div",{className:"panel panel-white portfolio-sub-components",id:"portfolio-sub-components"},a.createElement("table",{className:"data zebra"},a.createElement("thead",null,a.createElement("tr",null,a.createElement("th",null," "),a.createElement("th",{className:"text-center portfolio-sub-components-cell"},Object(o.translate)("metric_domain.Releasability")),a.createElement("th",{className:"text-center portfolio-sub-components-cell"},Object(o.translate)("metric_domain.Reliability")),a.createElement("th",{className:"text-center portfolio-sub-components-cell"},Object(o.translate)("portfolio.metric_domain.vulnerabilities")),a.createElement("th",{className:"text-center portfolio-sub-components-cell"},Object(o.translate)("portfolio.metric_domain.security_hotspots")),a.createElement("th",{className:"text-center portfolio-sub-components-cell"},Object(o.translate)("metric_domain.Maintainability")),a.createElement("th",{className:"text-center portfolio-sub-components-cell"},Object(o.translate)("metric.ncloc.name")))),a.createElement("tbody",null,r.map(function(e){return a.createElement("tr",{key:e.key},a.createElement("td",null,a.createElement(b.Link,{className:"link-with-icon",to:Object(g.s)(e.refKey||e.key)},a.createElement(ee.a,{qualifier:e.qualifier})," ",e.name)),"TRK"===e.qualifier?ne(e.measures,"alert_status","LEVEL"):ne(e.measures,"releasability_rating","RATING"),ne(e.measures,"reliability_rating","RATING"),ne(e.measures,"security_rating","RATING"),ne(e.measures,"security_review_rating","RATING"),ne(e.measures,"sqale_rating","RATING"),function(e,t){var r=Number(e.ncloc||0),n=t>0?Math.max(1,Math.round(r/t*50)):0;return a.createElement("td",{className:"text-right"},a.createElement("span",{className:"note"},a.createElement(c.a,{metricKey:"ncloc",metricType:"SHORT_INT",value:e.ncloc})),t>0&&a.createElement("svg",{className:"spacer-left",height:"16",width:"50"},a.createElement("rect",{className:"bar-chart-bar",fill:re.colors.blue,height:"10",width:n,x:"0",y:"3"})))}(e.measures,l))}))),n>i&&a.createElement("footer",{className:"spacer-top note text-center"},Object(o.translateWithParameters)("x_of_y_shown",Object(te.formatMeasure)(i,"INT"),Object(te.formatMeasure)(n,"INT")),a.createElement(b.Link,{className:"spacer-left",to:s},Object(o.translate)("show_more"))))}function ne(e,t,r){return a.createElement("td",{className:"text-center"},a.createElement(c.a,{metricKey:t,metricType:r,value:e[t]}))}r.d(t,"App",function(){return le});var oe=function(){var e=function(t,r){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var r in t)t.hasOwnProperty(r)&&(e[r]=t[r])})(t,r)};return function(t,r){function a(){this.constructor=t}e(t,r),t.prototype=null===r?Object.create(r):(a.prototype=r.prototype,new a)}}(),ie=function(){return(ie=Object.assign||function(e){for(var t,r=1,a=arguments.length;r<a;r++)for(var n in t=arguments[r])Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e}).apply(this,arguments)},le=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={loading:!0},t.isEmpty=function(){return void 0===t.state.measures||void 0===t.state.measures.ncloc},t.isNotComputed=function(){return t.state.measures&&void 0===t.state.measures.reliability_rating},t}return oe(t,e),t.prototype.componentDidMount=function(){this.mounted=!0,this.props.fetchMetrics(),this.fetchData()},t.prototype.componentDidUpdate=function(e){e.component!==this.props.component&&this.fetchData()},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.fetchData=function(){var e=this;this.setState({loading:!0}),Promise.all([Object(l.d)({component:this.props.component.key,metricKeys:u.join()}),Object(i.h)(this.props.component.key,f,{ps:20,s:"qualifier"})]).then(function(t){var r=t[0],a=t[1];e.mounted&&e.setState({loading:!1,measures:d(r),subComponents:a.components.map(function(e){return ie({},e,{measures:d(e.measures)})}),totalSubComponents:a.paging.total})},function(){e.mounted&&e.setState({loading:!1})})},t.prototype.renderSpinner=function(){return a.createElement("div",{className:"page page-limited"},a.createElement("div",{className:"text-center"},a.createElement("i",{className:"spinner spacer"})))},t.prototype.renderEmpty=function(){return a.createElement("div",{className:"page page-limited"},a.createElement("div",{className:"empty-search"},a.createElement("h3",null,this.state.measures&&this.state.measures.projects?Object(o.translate)("portfolio.no_lines_of_code"):Object(o.translate)("portfolio.empty"))))},t.prototype.renderWhenNotComputed=function(){return a.createElement("div",{className:"page page-limited"},a.createElement("div",{className:"empty-search"},a.createElement("h3",null,Object(o.translate)("portfolio.not_computed"))))},t.prototype.render=function(){var e=this.props.component,t=this.state,r=t.loading,n=t.measures,i=t.subComponents,l=t.totalSubComponents;return r?this.renderSpinner():this.isEmpty()?this.renderEmpty():this.isNotComputed()?this.renderWhenNotComputed():a.createElement("div",{className:"page page-limited portfolio-overview"},a.createElement("div",{className:"page-actions"},a.createElement(Y,{component:e})),a.createElement("h1",null,Object(o.translate)("portfolio.health_factors")),a.createElement("div",{className:"portfolio-boxes"},a.createElement(I,{component:e.key,measures:n,metricKey:"releasability"}),a.createElement(I,{component:e.key,measures:n,metricKey:"reliability"}),a.createElement(I,{component:e.key,measures:n,metricKey:"vulnerabilities"}),a.createElement(I,{component:e.key,measures:n,metricKey:"security_hotspots"}),a.createElement(I,{component:e.key,measures:n,metricKey:"maintainability"})),a.createElement("h1",null,Object(o.translate)("portfolio.breakdown")),a.createElement("div",{className:"portfolio-breakdown"},a.createElement("div",{className:"portfolio-breakdown-box"},a.createElement("h2",{className:"text-muted small"},Object(o.translate)("portfolio.number_of_projects")),a.createElement("div",{className:"portfolio-breakdown-metric huge"},a.createElement(c.a,{metricKey:"projects",metricType:"SHORT_INT",value:n&&n.projects||"0"})),a.createElement("div",{className:"portfolio-breakdown-box-link"},a.createElement("div",null,a.createElement(_,{component:e.key,metric:"projects"})))),a.createElement("div",{className:"portfolio-breakdown-box"},a.createElement("h2",{className:"text-muted small"},Object(o.translate)("portfolio.number_of_lines")),a.createElement("div",{className:"portfolio-breakdown-metric huge"},a.createElement(c.a,{metricKey:"ncloc",metricType:"SHORT_INT",value:n&&n.ncloc||"0"})),a.createElement("div",{className:"portfolio-breakdown-box-link"},a.createElement("div",null,a.createElement(_,{component:e.key,label:Object(o.translate)("portfolio.language_breakdown_link"),metric:"ncloc"}))))),void 0!==i&&void 0!==l&&a.createElement(ae,{component:e.key,subComponents:i,total:l}))},t}(a.PureComponent),ce={fetchMetrics:s.e};t.default=Object(n.connect)(function(e){return{metrics:Object(m.getMetrics)(e)}},ce)(le)},653:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r(639),n=r(12),o=r(692),i=r(665);r(666);var l=r(644);t.default=function(e){var t=e.tagName,r=void 0===t?"div":t;return n.createElement(r,{className:a("help-tooltip",e.className)},n.createElement(l.default,{mouseLeaveDelay:.25,onShow:e.onShow,overlay:e.overlay,placement:e.placement},n.createElement("span",{className:"display-inline-flex-center"},e.children||n.createElement(i.ThemeConsumer,null,function(e){return n.createElement(o.default,{fill:e.colors.gray71,size:12})}))))}},666:function(e,t,r){var a=r(667);"string"==typeof a&&(a=[[e.i,a,""]]);var n={hmr:!0,transform:void 0,insertInto:void 0};r(643)(a,n);a.locals&&(e.exports=a.locals)},667:function(e,t,r){(e.exports=r(642)(!1)).push([e.i,".help-tooltip{display:inline-flex;align-items:center;vertical-align:middle}.help-toolip-link{display:block;width:12px;height:12px;border:none}",""])},676:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r(12),n=r(641),o={app:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M3.014 10.986a2 2 0 1 1-.001 4.001 2 2 0 0 1 .001-4.001zm9.984 0a2 2 0 1 1-.001 4.001 2 2 0 0 1 .001-4.001zm-5.004-.021c1.103 0 2 .896 2 2s-.897 2-2 2a2 2 0 0 1 0-4zm-4.98 1.021a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm9.984 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm-5.004-.021a1 1 0 1 1 0 2 1 1 0 0 1 0-2zM2.984 6a2 2 0 1 1-.001 4.001A2 2 0 0 1 2.984 6zm9.984 0a2 2 0 1 1-.001 4.001A2 2 0 0 1 12.968 6zm-5.004-.021c1.103 0 2 .897 2 2a2 2 0 1 1-2-2zM2.984 7a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm9.984 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm-5.004-.021a1.001 1.001 0 0 1 0 2 1 1 0 0 1 0-2zM3 1.025a2 2 0 1 1-.001 4.001A2 2 0 0 1 3 1.025zm9.984 0a2 2 0 1 1-.001 4.001 2 2 0 0 1 .001-4.001zM7.98 1.004c1.103 0 2 .896 2 2s-.897 2-2 2a2 2 0 0 1 0-4zM3 2.025a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm9.984 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2zM7.98 2.004a1.001 1.001 0 0 1 0 2 1 1 0 0 1 0-2z",style:{fill:r||t.colors.blue}})})},brc:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M8 9V8h6v1h1v1h1v6H6v-6h1V9h1zm7 2H7v4h8v-4zm-1-7v3h-1V5H1v7h4v1H0V4h14zm-1-2v1.5h-1V3H2v.5H1V2h12zm-1-2v1.5h-1V1H3v.5H2V0h10z",style:{fill:r||t.colors.blue}})})},dev:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M7.974 8.02a3.5 3.5 0 0 1-2.482-1.017 3.428 3.428 0 0 1-1.028-2.455c0-.927.365-1.8 1.028-2.455a3.505 3.505 0 0 1 2.482-1.017 3.5 3.5 0 0 1 2.482 1.017 3.434 3.434 0 0 1 1.027 2.455c0 .928-.365 1.8-1.027 2.455A3.504 3.504 0 0 1 7.974 8.02zm0-5.778c-1.286 0-2.332 1.034-2.332 2.306s1.046 2.307 2.332 2.307c1.285 0 2.332-1.035 2.332-2.307S9.258 2.242 7.974 2.242zm3.534 6.418c.127.016.243.045.348.086.17.066.302.146.406.246.132.124.253.282.36.47.126.218.226.442.3.668.08.253.15.535.206.838.056.313.095.604.113.867.02.28.03.57.03.862 0 .532-.174.758-.306.882-.142.132-.397.31-.973.31H3.948c-.233 0-.437-.03-.606-.09-.14-.05-.26-.123-.366-.222-.13-.123-.306-.35-.306-.88 0-.294.01-.584.03-.863.018-.263.056-.554.112-.867a6.5 6.5 0 0 1 .207-.838c.073-.226.173-.45.298-.667.108-.19.23-.347.36-.47.106-.1.238-.18.407-.247.105-.04.22-.07.348-.086.202.13.432.277.683.435.342.217.756.4 1.265.564.523.166 1.06.25 1.59.25a5.25 5.25 0 0 0 1.592-.25c.51-.164.923-.348 1.266-.565.25-.158.48-.304.682-.435l-.002.002zm-.244-1.18c-.055 0-.184.066-.387.196-.202.13-.43.276-.685.437-.255.16-.586.307-.994.437-.408.13-.818.196-1.23.196-.41 0-.82-.065-1.228-.196a4.303 4.303 0 0 1-.993-.437c-.255-.16-.484-.306-.686-.437-.202-.13-.33-.196-.386-.196-.374 0-.716.06-1.026.183-.31.12-.572.283-.787.487a3.28 3.28 0 0 0-.57.737 4.662 4.662 0 0 0-.395.888c-.098.303-.18.633-.244.988a9.652 9.652 0 0 0-.128.992c-.02.306-.032.62-.032.942 0 .73.224 1.304.672 1.726.448.42 1.043.632 1.785.632h8.044c.743 0 1.34-.21 1.787-.633.447-.42.67-.996.67-1.725 0-.32-.01-.635-.03-.942a9.159 9.159 0 0 0-.374-1.98c-.098-.304-.23-.6-.395-.888a3.23 3.23 0 0 0-.57-.737 2.404 2.404 0 0 0-.788-.487 2.779 2.779 0 0 0-1.026-.183h-.004z",style:{fill:r||t.colors.blue}})})},dir:i,fil:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M14 15H2V1l7.997.02c1 .034 1.759.758 2.428 1.42.667.663 1.561 1.605 1.574 2.555H14V15zM9 2H3v12h10V6H9V2zm3 10H4v-1h8v1zm0-2H4V9h8v1zm-1.988-5h3.008c-.012-.674-.714-1.443-1.204-1.937-.488-.495-1.039-1.058-1.816-1.055v2.96l.012.032z",style:{fill:r||t.colors.blue}})})},svw:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M14 7h2v9H7v-2H0V0h14v7zM8 8v7h7V8H8zm3 6H9v-2h2v2zm3 0h-2v-2h2v2zm-1-7V1H1v12h6V7h6zm-7 5H2V8h4v4zm5-1H9V9h2v2zm3 0h-2V9h2v2zM5 9H3v2h2V9zm1-3H2V2h4v4zm6 0H8V2h4v4zM5 3H3v2h2V3zm6 0H9v2h2V3z",style:{fill:r||t.colors.blue}})})},trk:l,uts:c,vw:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M14.97 14.97H1.016V1.015H14.97V14.97zm-1-12.955H2.015V13.97H13.97V2.015zm-.973 10.982H9V9h3.997v3.997zM7 12.996H3.004V9H7v3.996zM11.997 10H10v1.997h1.997V10zM6 10H4.004v1.996H6V10zm1-3H3.006V3.006H7V7zm5.985 0H9V3.015h3.985V7zM6 4.006H4.006V6H6V4.006zm5.985.009H10V6h1.985V4.015z",style:{fill:r||t.colors.blue}})})},cla:c,dev_prj:l,lib:function(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M1 13h4V3H1v10zm3-1H2v-2h2v2zM2 4h2v4H2V4zm4 9h4V3H6v10zm3-1H7v-2h2v2zM7 4h2v4H7V4zm4 9h4V3h-4v10zm3-1h-2v-2h2v2zm-2-8h2v4h-2V4z",style:{fill:r||t.colors.blue}})})},pac:i};function i(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M14 12.286V5.703a.673.673 0 0 0-.195-.5.644.644 0 0 0-.49-.203H6.704a.686.686 0 0 1-.5-.214.707.707 0 0 1-.203-.51v-.57c0-.2-.07-.363-.207-.502A.679.679 0 0 0 5.29 3H2.707a.672.672 0 0 0-.5.204.683.683 0 0 0-.206.5v8.582c0 .2.07.367.206.506.137.14.304.208.5.208h10.61a.66.66 0 0 0 .49-.208.685.685 0 0 0 .194-.506H14zm1-6.598v6.65c0 .458-.152.83-.475 1.16-.324.326-.7.502-1.15.502H2.647c-.452 0-.84-.175-1.162-.503a1.572 1.572 0 0 1-.486-1.158V3.654a1.6 1.6 0 0 1 .486-1.17A1.578 1.578 0 0 1 2.648 2h2.7c.45 0 .84.157 1.164.485.324.328.488.714.488 1.17V4h6.373c.452 0 .83.174 1.152.5.323.33.475.73.475 1.187v.001z",style:{fill:r||t.colors.orange}})})}function l(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M14.985 13.988L1 14.005 1.02 5h13.966v8.988h-.001zM1.998 5.995l.006 7.02L14.022 13 14 6.004l-12.002-.01v.001zM3 4.5V4h9.996l.004.5h1l-.005-1.497-11.98.003L2 4.5h1zm1-2v-.504h8.002L12 2.5h1l-.004-1.495H3.003L3 2.5h1z",style:{fill:r||t.colors.blue}})})}function c(e){var t=e.className,r=e.fill,o=e.size;return a.createElement(n.ThemedIcon,{className:t,size:o},function(e){var t=e.theme;return a.createElement("path",{d:"M14 15H2V1l7.997.02c1.013-.03 1.57.893 2.239 1.555.667.663 1.75 1.47 1.763 2.42H14V15zM9 2H3v12h10V6H9V2zM7 8l-3 2.5L7 13V8zm1 5l3-2.5L8 8v5zm2.012-8h3.008c-.012-.674-.78-1.258-1.27-1.752-.488-.495-.973-1.243-1.75-1.24v2.96l.012.032z",style:{fill:r||t.colors.blue}})})}t.default=function(e){if(!e.qualifier)return null;var t=e.qualifier.toLowerCase(),r=o[t];return r?a.createElement(r,{className:e.className,fill:e.fill}):null}},689:function(e,t,r){"use strict";r.d(t,"a",function(){return i});var a=r(12),n=r(634),o=r(160);function i(e){var t=e.children,r=e.date;return a.createElement(n.FormattedRelative,{value:Object(o.parseDate)(r)},t)}},695:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r(639),n=r(12),o=r(648);r(735),t.default=function(e){var t=o.formatMeasure(e.level,"LEVEL"),r=a(e.className,"level","level-"+e.level,{"level-small":e.small,"level-muted":e.muted});return n.createElement("span",{className:r},t)}},714:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r(639),n=r(12),o=r(34),i=r(648);r(812),t.default=function(e){var t=e.className,r=e.muted,l=void 0!==r&&r,c=e.small,s=void 0!==c&&c,m=e.value;if(void 0===m)return n.createElement("span",{"aria-label":o.translate("metric.no_rating")},"–");var u=i.formatMeasure(m,"RATING");return n.createElement("span",{"aria-label":o.translateWithParameters("metric.has_rating_X",u),className:a("rating","rating-"+u,{"rating-small":s,"rating-muted":l},t)},u)}},735:function(e,t,r){var a=r(736);"string"==typeof a&&(a=[[e.i,a,""]]);var n={hmr:!0,transform:void 0,insertInto:void 0};r(643)(a,n);a.locals&&(e.exports=a.locals)},736:function(e,t,r){(e.exports=r(642)(!1)).push([e.i,".level{display:inline-block;min-width:80px;height:24px;line-height:24px;border-radius:24px;box-sizing:border-box;color:#fff;letter-spacing:.02em;font-size:13px;font-weight:400;text-align:center;text-shadow:0 0 1px rgba(0,0,0,.35)}.level,.level-small{width:auto;padding-left:9px;padding-right:9px}.level-small{min-width:64px;margin-top:-1px;margin-bottom:-1px;height:20px;line-height:20px;font-size:12px}.level-muted{background-color:#bdbdbd!important}a>.level{margin-bottom:-1px;border-bottom:1px solid;transition:all .2s ease}a>.level:hover{opacity:.8}.level-OK{background-color:#0a0}.level-WARN{background-color:#ed7d20}.level-ERROR{background-color:#d4333f}.level-NONE{background-color:#b4b4b4}",""])},744:function(e,t,r){"use strict";r.d(t,"a",function(){return p});var a=r(12),n=r(644),o=r.n(n),i=r(695),l=r.n(i),c=r(714),s=r.n(c),m=r(648),u=r(751);function p(e){var t=e.className,r=e.decimals,n=e.metricKey,i=e.metricType,c=e.small,p=e.value;if(void 0===p)return a.createElement("span",null,"–");if("LEVEL"===i)return a.createElement(l.a,{className:t,level:p,small:c});if("RATING"!==i){var f=Object(m.formatMeasure)(p,i,{decimals:r});return a.createElement("span",{className:t},null!=f?f:"–")}var d=Object(u.c)(n,Number(p)),b=a.createElement(s.a,{small:c,value:p});return d?a.createElement(o.a,{overlay:d},a.createElement("span",{className:t},b)):b}},750:function(e,t,r){"use strict";r.d(t,"a",function(){return o});var a=r(708),n=r(711);function o(e){Object(n.default)().dispatch(a.b(e))}},751:function(e,t,r){"use strict";r.d(t,"a",function(){return l}),r.d(t,"b",function(){return c}),r.d(t,"c",function(){return s});var a=r(678),n=r(758),o=function(){return(o=Object.assign||function(e){for(var t,r=1,a=arguments.length;r<a;r++)for(var n in t=arguments[r])Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e}).apply(this,arguments)},i=["sqale_rating","maintainability_rating","reliability_rating","security_rating"];function l(e,t){return o({},e,{metric:t[e.metric],leak:c(e)})}function c(e){if(e&&e.periods){var t=Object(n.a)(e.periods);return t&&t.value}}function s(e,t){var r=Object(a.isDiffMetric)(e)?e.substr(4):e;if(i.includes(r))return Object(a.getRatingTooltip)(r,t)}},758:function(e,t,r){"use strict";r.d(t,"a",function(){return o}),r.d(t,"c",function(){return i}),r.d(t,"b",function(){return l});var a=r(160),n=r(34);function o(e){return function(e,t){if(Array.isArray(e))return e.find(function(e){return e.index===t})}(e,1)}function i(e,t){if(e){var r=e.modeParam||e.parameter||"";switch(e.mode){case"SPECIFIC_ANALYSIS":r=t(e.date);break;case"PREVIOUS_VERSION":r=r||t(e.date);break;case"previous_version":if(!r)return Object(n.translate)("overview.period.previous_version_only_date");break;case"date":r=r&&t(r);break;case"manual_baseline":r=r||t(e.date)}return Object(n.translateWithParameters)("overview.period."+e.mode.toLowerCase(),r)}}function l(e){return e&&e.date?Object(a.parseDate)(e.date):void 0}},812:function(e,t,r){var a=r(813);"string"==typeof a&&(a=[[e.i,a,""]]);var n={hmr:!0,transform:void 0,insertInto:void 0};r(643)(a,n);a.locals&&(e.exports=a.locals)},813:function(e,t,r){(e.exports=r(642)(!1)).push([e.i,".rating{display:inline-block;width:24px;height:24px;line-height:24px;border-radius:24px;box-sizing:border-box;color:#fff;font-size:16px;font-weight:400;text-align:center;text-shadow:0 0 1px rgba(0,0,0,.35)}.rating-muted{background-color:#bdbdbd!important;color:#fff!important;text-shadow:0 0 1px rgba(0,0,0,.35)!important}a>.rating{margin-bottom:-1px;border-bottom:1px solid;transition:all .2s ease}a>.rating:hover{opacity:.8}.rating-A{line-height:23px;background-color:#0a0}a>.rating-A{border-bottom-color:#0a0}.rating-B{background-color:#b0d513}a .rating-B{border-bottom-color:#b0d513}.rating-C{background-color:#eabe06}a .rating-C{border-bottom-color:#eabe06}.rating-D{background-color:#ed7d20}a .rating-D{border-bottom-color:#ed7d20}.rating-E{background-color:#d4333f}a .rating-E{border-bottom-color:#d4333f}.rating-small{width:18px;height:18px;line-height:18px;margin-top:-1px;margin-bottom:-1px;font-size:12px}",""])},887:function(e,t,r){var a=r(890);e.exports=function(e,t,r){for(var n=-1,o=e.length;++n<o;){var i=e[n],l=t(i);if(null!=l&&(void 0===c?l==l&&!a(l):r(l,c)))var c=l,s=i}return s}},971:function(e,t){e.exports=function(e,t){return e>t}}}]);
//# sourceMappingURL=296.1570825310815.chunk.js.map