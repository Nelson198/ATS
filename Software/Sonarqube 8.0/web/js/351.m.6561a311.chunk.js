(window.webpackJsonp=window.webpackJsonp||[]).push([[351],{1355:function(t,e,n){var i=n(1356);"string"==typeof i&&(i=[[t.i,i,""]]);var a={hmr:!0,transform:void 0,insertInto:void 0};n(313)(i,a);i.locals&&(t.exports=i.locals)},1356:function(t,e,n){(t.exports=n(312)(!1)).push([t.i,'.account-container{width:600px;margin-left:auto;margin-right:auto}.account-header{padding-top:20px;padding-bottom:20px;border-bottom:1px solid #e6e6e6;background-color:#fff}.account-nav{float:right;padding-top:11px}.account-user{float:left}.account-user h1{line-height:60px}.account-user-avatar{margin-right:20px}.account-user-avatar>img{border-radius:60px}.account-user-avatar:empty{display:none}.account-body{padding:40px 0}.account-separator{height:0;margin:40px 0;border-top:1px solid #e6e6e6}.account-projects-list{margin-left:-20px;margin-right:-20px}.account-projects-list>li{padding:15px 20px}.account-projects-list>li+li{border-top:1px solid #e6e6e6}.account-project-side{float:right;margin-left:10px;text-align:right}.account-project-analysis{line-height:24px;color:#777;font-size:12px}.account-project-card{position:relative;display:block}.account-project-name{display:inline-block;vertical-align:top;max-width:300px;overflow:hidden;text-overflow:ellipsis;white-space:nowrap}.account-project-name>a{border-bottom-color:#d0d0d0;color:#444}.account-project-name>a:hover{border-bottom-color:#cae3f2;color:#4b9fd5}.account-project-quality-gate{display:inline-block;vertical-align:top;line-height:24px;margin-left:8px}.account-project-description{margin-top:6px;line-height:1.5}.account-project-links{margin-top:6px}.account-project-key{margin-top:6px;color:#777;font-size:12px}.my-activity-issues{position:relative;display:flex;justify-content:center;margin-bottom:70px}.my-activity-issues:after{position:absolute;z-index:5;top:-15px;left:50%;width:1px;height:100px;background-color:#e6e6e6;transform:rotate(30deg);content:""}.my-activity-issues>a{display:block;padding:15px 20px;border:none;border-radius:2px;color:#444}.my-activity-issues>a:hover{background-color:#f3f3f3}.my-activity-recent-issues{margin-right:50px;text-align:right}.my-activity-recent-issues .my-activity-issues-note{text-align:left}.my-activity-all-issues{margin-left:50px}.my-activity-issues-number{display:inline-block;vertical-align:middle;line-height:36px;font-size:36px;font-weight:300}.my-activity-issues-note{display:inline-block;vertical-align:middle;padding-left:10px;padding-top:2px;line-height:16px;font-size:12px}.my-activity-projects{width:360px;margin:0 auto;padding:40px 0}.my-activity-projects-header{line-height:24px;margin-bottom:15px;padding:0 10px}.my-activity-projects>ul>li+li{border-top:1px solid #e6e6e6}.my-activity-projects>ul>li>a{display:block;padding:15px 10px;border:none}.my-activity-projects>ul>li>a:hover{background-color:#f3f3f3}.my-activity-projects .level{width:60px}.my-activity-projects .more{margin-top:30px;text-align:center}.notifications-table{margin-top:-16px}.notifications-add-project-no-search-results{padding:8px}.notifications-add-project-search-results li{padding:8px;cursor:pointer}.notifications-add-project-search-results li.active,.notifications-add-project-search-results li:hover{background-color:#f3f3f3}',""])},1813:function(t,e,n){"use strict";n.r(e);var i=n(2),a=n(325),o=n.n(a),r=n(316),c=n(31),s=n.n(c),l=n(5),p=n(343),u=n(330),d=n(317),m=(n(1355),n(28)),g=n(683),h=n.n(g);function v(t){let e=t.customOrganizations;return i.createElement("nav",{className:"account-nav"},i.createElement(h.a,null,i.createElement("li",null,i.createElement(m.IndexLink,{activeClassName:"active",to:"/account/"},Object(l.translate)("my_account.profile"))),i.createElement("li",null,i.createElement(m.Link,{activeClassName:"active",to:"/account/security/"},Object(l.translate)("my_account.security"))),i.createElement("li",null,i.createElement(m.Link,{activeClassName:"active",to:"/account/notifications"},Object(l.translate)("my_account.notifications"))),!e&&i.createElement("li",null,i.createElement(m.Link,{activeClassName:"active",to:"/account/projects/"},Object(l.translate)("my_account.projects"))),e&&i.createElement("li",null,i.createElement(m.Link,{activeClassName:"active",to:"/account/organizations"},Object(l.translate)("my_account.organizations")))))}var x=n(390);function y(t){let e=t.user;return i.createElement("div",{className:"account-user"},i.createElement("div",{className:"pull-left account-user-avatar",id:"avatar"},i.createElement(x.a,{hash:e.avatar,name:e.name,size:60})),i.createElement("h1",{className:"pull-left",id:"name"},e.name))}n.d(e,"Account",function(){return f});class f extends i.PureComponent{componentDidMount(){this.props.currentUser.isLoggedIn||s()()}render(){const t=this.props,e=t.currentUser,n=t.children;if(!e.isLoggedIn)return null;const a=Object(l.translate)("my_account.page");return i.createElement("div",{id:"account-page"},i.createElement(u.a,{suggestions:"account"}),i.createElement(o.a,{defaultTitle:a,titleTemplate:"%s - "+a}),i.createElement(p.a,{anchor:"account_main"}),i.createElement("header",{className:"account-header"},i.createElement("div",{className:"account-container clearfix"},i.createElement(y,{user:e}),i.createElement(v,{customOrganizations:this.props.customOrganizations}))),n)}}e.default=Object(r.connect)(t=>({currentUser:Object(d.getCurrentUser)(t),customOrganizations:Object(d.areThereCustomOrganizations)(t)}))(f)},330:function(t,e,n){"use strict";n.d(e,"a",function(){return o});var i=n(2),a=n(349);function o(t){let e=t.suggestions;return i.createElement(a.a.Consumer,null,t=>{let n=t.addSuggestions,a=t.removeSuggestions;return i.createElement(r,{addSuggestions:n,removeSuggestions:a,suggestions:e})})}class r extends i.PureComponent{componentDidMount(){this.props.addSuggestions(this.props.suggestions)}componentDidUpdate(t){t.suggestions!==this.props.suggestions&&(this.props.removeSuggestions(this.props.suggestions),this.props.addSuggestions(t.suggestions))}componentWillUnmount(){this.props.removeSuggestions(this.props.suggestions)}render(){return null}}},343:function(t,e,n){"use strict";n.d(e,"a",function(){return r});var i=n(2),a=n(5),o=n(399);function r(t){return i.createElement(o.a.Consumer,null,e=>{let n=e.addA11ySkipLink,a=e.removeA11ySkipLink;return i.createElement(c,Object.assign({addA11ySkipLink:n,removeA11ySkipLink:a},t))})}class c extends i.PureComponent{constructor(){super(...arguments),this.getLink=()=>{const t=this.props,e=t.anchor,n=t.label;return{key:e,label:void 0===n?Object(a.translate)("skip_to_content"):n,weight:t.weight}}}componentDidMount(){this.props.addA11ySkipLink(this.getLink())}componentWillUnmount(){this.props.removeA11ySkipLink(this.getLink())}render(){const t=this.props.anchor;return i.createElement("span",{id:"a11y_target__".concat(t)})}}}}]);
//# sourceMappingURL=351.m.6561a311.chunk.js.map