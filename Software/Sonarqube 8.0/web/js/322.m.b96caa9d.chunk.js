(window.webpackJsonp=window.webpackJsonp||[]).push([[322],{1369:function(e,t,n){var o=n(832);e.exports=function(e,t){return t="function"==typeof t?t:void 0,e&&e.length?o(e,void 0,t):[]}},1787:function(e,t,n){"use strict";n.r(t);var o=n(1369),i=n.n(o),a=n(442),r=n.n(a),c=n(2),s=n(325),l=n.n(s),h=n(326),d=n(315),u=n.n(d),p=n(5),f=n(8),m=n(320);var b=n(22),g=n(359),v=n.n(g);class y extends c.PureComponent{isEnabled(e,t){return!!this.props.notifications.find(n=>n.type===e&&n.channel===t)}handleCheck(e,t,n){n?this.props.onAdd({type:e,channel:t}):this.props.onRemove({type:e,channel:t})}getDispatcherLabel(e){const t=["notification.dispatcher",e],n=[...t,"project"];return this.props.project&&Object(p.hasMessage)(...n)?Object(p.translate)(...n):Object(p.translate)(...t)}render(){const e=this.props,t=e.channels,n=e.checkboxId,o=e.types;return c.createElement("tbody",null,o.map(e=>c.createElement("tr",{key:e},c.createElement("td",null,this.getDispatcherLabel(e)),t.map(t=>c.createElement("td",{className:"text-center",key:t},c.createElement(v.a,{checked:this.isEnabled(e,t),id:n(e,t),onCheck:n=>this.handleCheck(e,t,n)}))))))}}var j=n(316),k=n(317);const E={setCurrentUserSetting:n(461).e};var x=Object(j.connect)(e=>{return{notificationsOptOut:"true"===Object(k.getCurrentUserSetting)(e,"notifications.optOut")}},E)(class extends c.PureComponent{constructor(){super(...arguments),this.handleCheckOptOut=e=>{this.props.setCurrentUserSetting({key:"notifications.optOut",value:e?"false":"true"})}}render(){return c.createElement("section",{className:"boxed-group"},c.createElement("h2",null,Object(p.translate)("my_profile.sonarcloud_feature_notifications.title")),c.createElement("div",{className:"boxed-group-inner"},c.createElement("table",{className:"data zebra"},c.createElement("thead",null,c.createElement("tr",null,c.createElement("th",null),c.createElement("th",{className:"text-center"},c.createElement("h4",null,Object(p.translate)("activate"))))),c.createElement("tbody",null,c.createElement("tr",null,c.createElement("td",null,Object(p.translate)("my_profile.sonarcloud_feature_notifications.description")),c.createElement("td",{className:"text-center"},c.createElement(v.a,{checked:!this.props.notificationsOptOut,onCheck:this.handleCheckOptOut})))))))}});function N(e){return c.createElement(c.Fragment,null,c.createElement("section",{className:"boxed-group"},c.createElement("h2",null,Object(p.translate)("my_profile.overall_notifications.title")),c.createElement("div",{className:"boxed-group-inner"},c.createElement("table",{className:"data zebra"},c.createElement("thead",null,c.createElement("tr",null,c.createElement("th",null),e.channels.map(e=>c.createElement("th",{className:"text-center",key:e},c.createElement("h4",null,Object(p.translate)("notification.channel",e)))))),c.createElement(y,{channels:e.channels,checkboxId:O,notifications:e.notifications,onAdd:e.addNotification,onRemove:e.removeNotification,types:e.types})))),Object(b.isSonarCloud)()&&c.createElement(x,null))}function O(e,t){return"global-notification-".concat(e,"-").concat(t)}var _=n(543),S=n.n(_),C=n(324),w=n.n(C),P=n(395),M=n.n(P),D=n(310),I=n(358),A=n.n(I),T=n(362),L=n.n(T),z=n(309),F=n(328),U=n(332),H=n.n(U),q=n(357);class B extends c.PureComponent{constructor(e){super(e),this.mounted=!1,this.handleKeyDown=e=>{switch(e.keyCode){case 13:e.preventDefault(),this.handleSelectHighlighted();break;case 38:e.preventDefault(),this.handleHighlightPrevious();break;case 40:e.preventDefault(),this.handleHighlightNext()}},this.getCurrentIndex=()=>{const e=this.state,t=e.highlighted,n=e.suggestions;return t&&n?n.findIndex(e=>e.project===t.project):-1},this.highlightIndex=e=>{const t=this.state.suggestions;t&&t.length>0&&(e<0?e=t.length-1:e>=t.length&&(e=0),this.setState({highlighted:t[e]}))},this.handleHighlightPrevious=()=>{this.highlightIndex(this.getCurrentIndex()-1)},this.handleHighlightNext=()=>{this.highlightIndex(this.getCurrentIndex()+1)},this.handleSelectHighlighted=()=>{const e=this.state,t=e.highlighted,n=e.selectedProject;void 0!==t&&(void 0!==n&&t.project===n.project?this.handleSubmit():this.handleSelect(t))},this.handleSearch=e=>{const t=this.props.addedProjects;return e.length<2?(this.setState({open:!1,query:e}),Promise.resolve([])):(this.setState({loading:!0,query:e}),Object(q.v)(e).then(e=>{if(this.mounted){let n=void 0;const o=e.results.find(e=>"TRK"===e.q);o&&o.items.length>0&&(n=o.items.filter(e=>!t.find(t=>t.project===e.key)).map(e=>({project:e.key,projectName:e.name}))),this.setState({loading:!1,open:!0,suggestions:n})}},()=>{this.mounted&&this.setState({loading:!1,open:!1})}))},this.handleSelect=e=>{this.setState({open:!1,query:e.projectName,selectedProject:e})},this.handleSubmit=()=>{const e=this.state.selectedProject;e&&this.props.onSubmit(e)},this.state={},this.handleSearch=L()(this.handleSearch,250)}componentDidMount(){this.mounted=!0}componentWillUnmount(){this.mounted=!1}render(){const e=this.props.closeModal,t=this.state,n=t.highlighted,o=t.loading,i=t.query,a=t.open,r=t.selectedProject,s=t.suggestions,l=Object(p.translate)("my_account.set_notifications_for.title");return c.createElement(H.a,{header:l,onClose:e,onSubmit:this.handleSubmit},e=>{let t=e.onCloseClick,h=e.onFormSubmit;return c.createElement("form",{onSubmit:h},c.createElement("header",{className:"modal-head"},c.createElement("h2",null,l)),c.createElement("div",{className:"modal-body"},c.createElement("div",{className:"modal-field abs-width-400"},c.createElement("label",null,Object(p.translate)("my_account.set_notifications_for")),c.createElement(A.a,{autoFocus:!0,onChange:this.handleSearch,onKeyDown:this.handleKeyDown,placeholder:Object(p.translate)("search.placeholder"),value:i}),o&&c.createElement("i",{className:"spinner spacer-left"}),!o&&a&&c.createElement("div",{className:"position-relative"},c.createElement(F.DropdownOverlay,{className:"abs-width-400",noPadding:!0},s&&s.length>0?c.createElement("ul",{className:"notifications-add-project-search-results"},s.map(e=>c.createElement("li",{className:z({active:n&&n.project===e.project}),key:e.project,onClick:()=>this.handleSelect(e)},e.projectName))):c.createElement("div",{className:"notifications-add-project-no-search-results"},Object(p.translate)("no_results")))))),c.createElement("footer",{className:"modal-foot"},c.createElement("div",null,c.createElement(D.SubmitButton,{disabled:void 0===r},Object(p.translate)("add_verb")),c.createElement(D.ResetButtonLink,{onClick:t},Object(p.translate)("cancel")))))})}}var R=n(702),K=n.n(R);function J(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=[],o=!0,i=!1,a=void 0;try{for(var r,c=e[Symbol.iterator]();!(o=(r=c.next()).done)&&(n.push(r.value),!t||n.length!==t);o=!0);}catch(e){i=!0,a=e}finally{try{o||null==c.return||c.return()}finally{if(i)throw a}}return n}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}()}function W(e){const t=e.collapsed,n=e.project,o=e.channels,i=J(c.useState(t),2),a=i[0],r=i[1];return c.createElement(K.a,{onClick:()=>r(!a),open:!a,title:c.createElement("h4",{className:"display-inline-block"},n.projectName)},c.createElement("table",{className:"data zebra notifications-table",key:n.project},c.createElement("thead",null,c.createElement("tr",null,c.createElement("th",{"aria-label":Object(p.translate)("project")}),o.map(e=>c.createElement("th",{className:"text-center",key:e},c.createElement("h4",null,Object(p.translate)("notification.channel",e)))))),c.createElement(y,{channels:e.channels,checkboxId:(t,n)=>"project-notification-".concat(e.project.project,"-").concat(t,"-").concat(n),notifications:e.notifications,onAdd:t=>{let n=t.channel,o=t.type;e.addNotification(Object.assign({},e.project,{channel:n,type:o}))},onRemove:t=>{let n=t.channel,o=t.type;e.removeNotification(Object.assign({},e.project,{channel:n,type:o}))},project:!0,types:e.types})))}const V=3;function G(e){return void 0!==e.project&&void 0!==e.projectName}class Q extends c.PureComponent{constructor(){var e;super(...arguments),e=this,this.state={addedProjects:[],search:"",showModal:!1},this.filterSearch=(e,t)=>e.projectName&&e.projectName.toLowerCase().includes(t),this.handleAddProject=e=>{this.setState(t=>({addedProjects:[...t.addedProjects,e]}))},this.handleSearch=function(){let t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"";e.setState({search:t.toLowerCase()})},this.handleSubmit=e=>{e&&this.handleAddProject(e),this.closeModal()},this.closeModal=()=>{this.setState({showModal:!1})},this.openModal=()=>{this.setState({showModal:!0})},this.removeNotification=(e,t)=>{const n=t.find(t=>t.project===e.project);n&&this.handleAddProject(n),this.props.removeNotification(e)}}render(){const e=this.props,t=e.initialProjectNotificationsCount,n=e.notifications,o=this.state,i=o.addedProjects,a=o.search,r=S()(n,e=>e.project).filter(G),s=M()(n,e=>e.project),l=S()([...i,...r],e=>e.project),h=w()(l,"projectName").filter(e=>this.filterSearch(e,a)),d=t>V;return c.createElement("section",{className:"boxed-group","data-test":"account__project-notifications"},c.createElement("div",{className:"boxed-group-inner"},c.createElement("div",{className:"page-actions"},c.createElement(D.Button,{onClick:this.openModal},c.createElement("span",{"data-test":"account__add-project-notification"},Object(p.translate)("my_profile.per_project_notifications.add")))),c.createElement("h2",null,Object(p.translate)("my_profile.per_project_notifications.title"))),this.state.showModal&&c.createElement(B,{addedProjects:l,closeModal:this.closeModal,onSubmit:this.handleSubmit}),c.createElement("div",{className:"boxed-group-inner"},0===l.length&&c.createElement("div",{className:"note"},Object(p.translate)("my_account.no_project_notifications")),l.length>0&&c.createElement("div",{className:"big-spacer-bottom"},c.createElement(A.a,{onChange:this.handleSearch,placeholder:Object(p.translate)("search.search_for_projects")})),h.map(e=>{const t=!i.find(t=>t.project===e.project)&&d;return c.createElement(W,{addNotification:this.props.addNotification,channels:this.props.channels,collapsed:t,key:e.project,notifications:s[e.project]||[],project:e,removeNotification:e=>this.removeNotification(e,l),types:this.props.types})})))}}function X(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=[],o=!0,i=!1,a=void 0;try{for(var r,c=e[Symbol.iterator]();!(o=(r=c.next()).done)&&(n.push(r.value),!t||n.length!==t);o=!0);}catch(e){i=!0,a=e}finally{try{o||null==c.return||c.return()}finally{if(i)throw a}}return n}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}()}n.d(t,"default",function(){return Y});class Y extends c.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={channels:[],globalTypes:[],initialProjectNotificationsCount:0,loading:!0,notifications:[],perProjectTypes:[]},this.fetchNotifications=()=>{Object(f.getJSON)("/api/notifications/list").catch(m.a).then(e=>{if(this.mounted){const t=e.notifications,n=this.getNotificationUpdates(t).projectNotifications;this.setState({channels:e.channels,globalTypes:e.globalTypes,initialProjectNotificationsCount:n.length,loading:!1,notifications:e.notifications,perProjectTypes:e.perProjectTypes})}},()=>{this.mounted&&this.setState({loading:!1})})},this.addNotificationToState=e=>{this.setState(t=>{return{notifications:i()([...t.notifications,e],Z)}})},this.removeNotificationFromState=e=>{this.setState(t=>({notifications:t.notifications.filter(t=>!Z(t,e))}))},this.addNotification=e=>{this.addNotificationToState(e),function(e){return Object(f.post)("/api/notifications/add",e).catch(m.a)}({channel:e.channel,project:e.project,type:e.type}).catch(()=>{this.removeNotificationFromState(e)})},this.removeNotification=e=>{this.removeNotificationFromState(e),function(e){return Object(f.post)("/api/notifications/remove",e).catch(m.a)}({channel:e.channel,project:e.project,type:e.type}).catch(()=>{this.addNotificationToState(e)})},this.getNotificationUpdates=e=>{const t=X(r()(e,e=>!e.project),2);return{globalNotifications:t[0],projectNotifications:t[1]}}}componentDidMount(){this.mounted=!0,this.fetchNotifications()}componentWillUnmount(){this.mounted=!1}render(){const e=this.state,t=e.initialProjectNotificationsCount,n=e.notifications,o=this.getNotificationUpdates(n),i=o.globalNotifications,a=o.projectNotifications;return c.createElement("div",{className:"account-body account-container"},c.createElement(l.a,{title:Object(p.translate)("my_account.notifications")}),c.createElement(h.Alert,{variant:"info"},Object(p.translate)("notification.dispatcher.information")),c.createElement(u.a,{loading:this.state.loading},this.state.notifications&&c.createElement(c.Fragment,null,c.createElement(N,{addNotification:this.addNotification,channels:this.state.channels,notifications:i,removeNotification:this.removeNotification,types:this.state.globalTypes}),c.createElement(Q,{addNotification:this.addNotification,channels:this.state.channels,initialProjectNotificationsCount:t,notifications:a,removeNotification:this.removeNotification,types:this.state.perProjectTypes}))))}}function Z(e,t){return e.channel===t.channel&&e.type===t.type&&e.project===t.project}},332:function(e,t,n){"use strict";var o,i=this&&this.__extends||(o=function(e,t){return(o=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}o(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)}),a=this&&this.__assign||function(){return(a=Object.assign||function(e){for(var t,n=1,o=arguments.length;n<o;n++)for(var i in t=arguments[n])Object.prototype.hasOwnProperty.call(t,i)&&(e[i]=t[i]);return e}).apply(this,arguments)},r=this&&this.__rest||function(e,t){var n={};for(var o in e)Object.prototype.hasOwnProperty.call(e,o)&&t.indexOf(o)<0&&(n[o]=e[o]);if(null!=e&&"function"==typeof Object.getOwnPropertySymbols){var i=0;for(o=Object.getOwnPropertySymbols(e);i<o.length;i++)t.indexOf(o[i])<0&&Object.prototype.propertyIsEnumerable.call(e,o[i])&&(n[o[i]]=e[o[i]])}return n};Object.defineProperty(t,"__esModule",{value:!0});var c=n(2),s=n(327),l=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.mounted=!1,t.state={submitting:!1},t.stopSubmitting=function(){t.mounted&&t.setState({submitting:!1})},t.handleCloseClick=function(e){e&&(e.preventDefault(),e.currentTarget.blur()),t.props.onClose()},t.handleFormSubmit=function(e){e.preventDefault(),t.submit()},t.handleSubmitClick=function(e){e&&(e.preventDefault(),e.currentTarget.blur()),t.submit()},t.submit=function(){var e=t.props.onSubmit();e&&(t.setState({submitting:!0}),e.then(t.stopSubmitting,t.stopSubmitting))},t}return i(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this.props,t=e.children,n=e.header,o=e.onClose,i=(e.onSubmit,r(e,["children","header","onClose","onSubmit"]));return c.createElement(s.default,a({contentLabel:n,onRequestClose:o},i),t({onCloseClick:this.handleCloseClick,onFormSubmit:this.handleFormSubmit,onSubmitClick:this.handleSubmitClick,submitting:this.state.submitting}))},t}(c.Component);t.default=l},359:function(e,t,n){"use strict";var o,i=this&&this.__extends||(o=function(e,t){return(o=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}o(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)});Object.defineProperty(t,"__esModule",{value:!0});var a=n(309),r=n(2),c=n(315);n(386);var s=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.handleClick=function(e){e.preventDefault(),e.currentTarget.blur(),t.props.disabled||t.props.onCheck(!t.props.checked,t.props.id)},t}return i(t,e),t.prototype.render=function(){var e=this.props,t=e.checked,n=e.children,o=e.disabled,i=e.id,s=e.loading,l=e.right,h=e.thirdState,d=e.title,u=a("icon-checkbox",{"icon-checkbox-checked":t,"icon-checkbox-single":h,"icon-checkbox-disabled":o});return n?r.createElement("a",{"aria-checked":t,className:a("link-checkbox",this.props.className,{note:o,disabled:o}),href:"#",id:i,onClick:this.handleClick,role:"checkbox",title:d},l&&n,r.createElement(c.default,{loading:Boolean(s)},r.createElement("i",{className:u})),!l&&n):s?r.createElement(c.default,null):r.createElement("a",{"aria-checked":t,className:a(u,this.props.className),href:"#",id:i,onClick:this.handleClick,role:"checkbox",title:d})},t.defaultProps={thirdState:!1},t}(r.PureComponent);t.default=s},386:function(e,t,n){var o=n(387);"string"==typeof o&&(o=[[e.i,o,""]]);var i={hmr:!0,transform:void 0,insertInto:void 0};n(313)(o,i);o.locals&&(e.exports=o.locals)},387:function(e,t,n){(e.exports=n(312)(!1)).push([e.i,".icon-checkbox{display:inline-block;line-height:1;vertical-align:top;padding:1px 2px;box-sizing:border-box}a.icon-checkbox{border-bottom:none}.icon-checkbox:focus{outline:none}.icon-checkbox:before{content:\" \";display:inline-block;width:10px;height:10px;border:1px solid #236a97;border-radius:2px;transition:border-color .2s ease,background-color .2s ease,background-image .2s ease,box-shadow .4s ease}.icon-checkbox:not(.icon-checkbox-disabled):focus:before,.link-checkbox:not(.disabled):focus:focus .icon-checkbox:before{box-shadow:0 0 0 3px rgba(35,106,151,.25)}.icon-checkbox-checked:before{background-color:#4b9fd5;background-image:url(\"data:image/svg+xml;charset=utf-8,%3Csvg viewBox='0 0 14 14' xmlns='http://www.w3.org/2000/svg' fill-rule='evenodd' clip-rule='evenodd' stroke-linejoin='round' stroke-miterlimit='1.414'%3E%3Cpath d='M12 4.665c0 .172-.06.318-.18.438l-5.55 5.55c-.12.12-.266.18-.438.18s-.318-.06-.438-.18L2.18 7.438C2.06 7.317 2 7.17 2 7s.06-.318.18-.44l.878-.876c.12-.12.267-.18.44-.18.17 0 .317.06.437.18l1.897 1.903 4.233-4.24c.12-.12.266-.18.438-.18s.32.06.44.18l.876.88c.12.12.18.265.18.438z' fill='%23fff' fill-rule='nonzero'/%3E%3C/svg%3E\");border-color:#4b9fd5}.icon-checkbox-checked.icon-checkbox-single:before{background-image:url(\"data:image/svg+xml;charset=utf-8,%3Csvg viewBox='0 0 14 14' xmlns='http://www.w3.org/2000/svg' fill-rule='evenodd' clip-rule='evenodd' stroke-linejoin='round' stroke-miterlimit='1.414'%3E%3Cpath d='M10 4.698A.697.697 0 0 0 9.302 4H4.698A.697.697 0 0 0 4 4.698v4.604c0 .386.312.698.698.698h4.604A.697.697 0 0 0 10 9.302V4.698z' fill='%23fff'/%3E%3C/svg%3E\")}.icon-checkbox-disabled:before{border:1px solid #bbb;cursor:not-allowed}.icon-checkbox-disabled.icon-checkbox-checked:before{background-color:#bbb}.icon-checkbox-invisible{visibility:hidden}.link-checkbox{color:inherit;border-bottom:none}.link-checkbox.disabled,.link-checkbox.disabled:hover,.link-checkbox.disabled label{color:#777;cursor:not-allowed}.link-checkbox:active,.link-checkbox:focus,.link-checkbox:hover{color:inherit}",""])},395:function(e,t,n){var o=n(459),i=n(398),a=Object.prototype.hasOwnProperty,r=i(function(e,t,n){a.call(e,n)?e[n].push(t):o(e,n,[t])});e.exports=r},442:function(e,t,n){var o=n(398)(function(e,t,n){e[n?0:1].push(t)},function(){return[[],[]]});e.exports=o},446:function(e,t,n){"use strict";var o=this&&this.__assign||function(){return(o=Object.assign||function(e){for(var t,n=1,o=arguments.length;n<o;n++)for(var i in t=arguments[n])Object.prototype.hasOwnProperty.call(t,i)&&(e[i]=t[i]);return e}).apply(this,arguments)},i=this&&this.__rest||function(e,t){var n={};for(var o in e)Object.prototype.hasOwnProperty.call(e,o)&&t.indexOf(o)<0&&(n[o]=e[o]);if(null!=e&&"function"==typeof Object.getOwnPropertySymbols){var i=0;for(o=Object.getOwnPropertySymbols(e);i<o.length;i++)t.indexOf(o[i])<0&&Object.prototype.propertyIsEnumerable.call(e,o[i])&&(n[o[i]]=e[o[i]])}return n};Object.defineProperty(t,"__esModule",{value:!0});var a=n(2),r=n(447),c=n(419);t.default=function(e){var t=e.open,n=i(e,["open"]);return t?a.createElement(r.default,o({},n)):a.createElement(c.default,o({},n))}},447:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=n(2),i=n(311);t.default=function(e){var t=e.className,n=e.fill,a=void 0===n?"currentColor":n,r=e.size;return o.createElement(i.default,{className:t,size:r},o.createElement("path",{d:"M7.72 11.596L3.119 6.992A.382.382 0 0 1 3 6.713c0-.108.04-.2.118-.279l1.03-1.03a.382.382 0 0 1 .278-.117c.108 0 .201.04.28.117L8 8.7l3.294-3.295a.382.382 0 0 1 .28-.117c.108 0 .2.04.279.117l1.03 1.03a.382.382 0 0 1 .117.28c0 .107-.04.2-.118.278L8.28 11.596a.382.382 0 0 1-.279.117.382.382 0 0 1-.28-.117z",style:{fill:a}}))}},702:function(e,t,n){"use strict";var o,i=this&&this.__extends||(o=function(e,t){return(o=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)},function(e,t){function n(){this.constructor=e}o(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)});Object.defineProperty(t,"__esModule",{value:!0});var a=n(309),r=n(2),c=n(446),s=function(e){function t(){var t=null!==e&&e.apply(this,arguments)||this;return t.state={hoveringInner:!1},t.handleClick=function(){t.props.onClick(t.props.data)},t.onDetailEnter=function(){t.setState({hoveringInner:!0})},t.onDetailLeave=function(){t.setState({hoveringInner:!1})},t}return i(t,e),t.prototype.render=function(){var e=this.props,t=e.className,n=e.open,o=e.renderHeader,i=e.title;return r.createElement("div",{className:a("boxed-group boxed-group-accordion",t,{"no-hover":this.state.hoveringInner})},r.createElement("div",{className:"boxed-group-header",onClick:this.handleClick,role:"listitem"},r.createElement("span",{className:"boxed-group-accordion-title"},r.createElement(c.default,{className:"little-spacer-right",open:n}),i),o&&o()),n&&r.createElement("div",{className:"boxed-group-inner",onMouseEnter:this.onDetailEnter,onMouseLeave:this.onDetailLeave},this.props.children))},t}(r.PureComponent);t.default=s}}]);
//# sourceMappingURL=322.m.b96caa9d.chunk.js.map