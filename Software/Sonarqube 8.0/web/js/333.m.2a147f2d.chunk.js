(window.webpackJsonp=window.webpackJsonp||[]).push([[333],{1633:function(e,t,n){"use strict";n.r(t),t.default="Add new members to this organization and manage their permissions. Note that users must have signed up on the service to be able to find and add them.\n\n---\n\nSee also: [Manage a Team](/organizations/manage-team/)\n"},1780:function(e,t,n){"use strict";n.r(t);var a=n(316),s=n(438),r=n(317),o=n(2),i=n(325),l=n.n(i),m=n(352),c=n.n(m),u=n(5),h=n(418),p=n(676),d=n(343),g=n(330),b=n(324),f=n.n(b),E=n(372),v=n.n(E),O=n(318),z=n(390),j=n(1631),M=n.n(j),S=n(788),k=n.n(S),y=n(435),C=n.n(y),N=n(310),_=n(332),x=n.n(_),L=n(315),G=n.n(L),F=n(437),P=n(309),w=n(359),D=n.n(w);class U extends o.PureComponent{constructor(){super(...arguments),this.onCheck=e=>{const t=this.props.group;t.default||this.props.onCheck(t.name,e)},this.toggleCheck=()=>{this.onCheck(!this.props.checked)}}render(){const e=this.props.group;return o.createElement("li",{className:P("capitalize list-item-checkable-link",{disabled:e.default}),onClick:this.toggleCheck},o.createElement(D.a,{checked:this.props.checked,onCheck:this.onCheck})," ",e.name)}}class R extends o.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={},this.loadUserGroups=()=>{this.setState({loading:!0}),Object(F.e)({login:this.props.member.login,organization:this.props.organization.key}).then(e=>{this.mounted&&this.setState({loading:!1,userGroups:C()(e.groups,"name")})},()=>{this.mounted&&this.setState({loading:!1})})},this.isGroupSelected=e=>{if(this.state.userGroups){const t=this.state.userGroups[e]||{};return t.status?"add"===t.status:!0===t.selected}return!1},this.onCheck=(e,t)=>{this.setState(n=>{const a=n.userGroups,s=void 0===a?{}:a,r=s[e]||{};let o="";return r.selected&&!t?o="remove":!r.selected&&t&&(o="add"),{userGroups:Object.assign({},s,{[e]:Object.assign({},r,{status:o})})}})},this.handleSubmit=()=>this.props.updateMemberGroups(this.props.member,Object.keys(k()(this.state.userGroups,e=>"add"===e.status)),Object.keys(k()(this.state.userGroups,e=>"remove"===e.status))).then(this.props.onClose)}componentDidMount(){this.mounted=!0,this.loadUserGroups()}componentWillUnmount(){this.mounted=!1}render(){const e=this.state,t=e.loading,n=e.userGroups,a=void 0===n?{}:n,s=Object(u.translate)("organization.members.manage_groups"),r=M()(a,e=>void 0!==e.status);return o.createElement(x.a,{header:s,onClose:this.props.onClose,onSubmit:this.handleSubmit},e=>{let n=e.onCloseClick,a=e.onFormSubmit,i=e.submitting;return o.createElement("form",{onSubmit:a},o.createElement("header",{className:"modal-head"},o.createElement("h2",null,s)),o.createElement("div",{className:"modal-body modal-container"},o.createElement("p",null,o.createElement("strong",null,Object(u.translateWithParameters)("organization.members.members_groups",this.props.member.name))),t?o.createElement(G.a,{className:"spacer-top"}):o.createElement("ul",{className:"list-spaced"},this.props.organizationGroups.map(e=>o.createElement(U,{checked:this.isGroupSelected(e.name),group:e,key:e.id,onCheck:this.onCheck})))),o.createElement("footer",{className:"modal-foot"},o.createElement(G.a,{className:"spacer-right",loading:i}),o.createElement(N.SubmitButton,{disabled:i||!r},Object(u.translate)("save")),o.createElement(N.ResetButtonLink,{disabled:i,onClick:n},Object(u.translate)("cancel"))))})}}var A=n(327),W=n.n(A);class B extends o.PureComponent{constructor(){super(...arguments),this.handleSubmit=e=>{e.preventDefault(),this.props.removeMember(this.props.member),this.props.onClose()}}render(){const e=Object(u.translate)("users.remove");return o.createElement(W.a,{contentLabel:e,key:"remove-member-modal",onRequestClose:this.props.onClose},o.createElement("header",{className:"modal-head"},o.createElement("h2",null,e)),o.createElement("form",{onSubmit:this.handleSubmit},o.createElement("div",{className:"modal-body"},Object(u.translateWithParameters)("organization.members.remove_x",this.props.member.name,this.props.organization.name)),o.createElement("footer",{className:"modal-foot"},o.createElement("div",null,o.createElement(N.SubmitButton,{autoFocus:!0,className:"button-red"},Object(u.translate)("remove")),o.createElement(N.ResetButtonLink,{onClick:this.props.onClose},Object(u.translate)("cancel"))))))}}const q=36;class T extends o.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={removeMemberForm:!1,manageGroupsForm:!1},this.handleManageGroupsClick=()=>{this.setState({manageGroupsForm:!0})},this.closeManageGroupsForm=()=>{this.mounted&&this.setState({manageGroupsForm:!1})},this.handleRemoveMemberClick=()=>{this.setState({removeMemberForm:!0})},this.closeRemoveMemberForm=()=>{this.mounted&&this.setState({removeMemberForm:!1})}}componentDidMount(){this.mounted=!0}componentWillUnmount(){this.mounted=!1}render(){const e=this.props,t=e.member,n=e.organization,a=e.removeMember,s=n.actions,r=void 0===s?{}:s;return o.createElement("tr",null,o.createElement("td",{className:"thin nowrap"},o.createElement(z.a,{hash:t.avatar,name:t.name,size:q})),o.createElement("td",{className:"nowrap text-middle"},o.createElement("strong",null,t.name),o.createElement("span",{className:"note little-spacer-left"},t.login)),r.admin&&o.createElement("td",{className:"text-right text-middle"},Object(u.translateWithParameters)("organization.members.x_groups",Object(O.formatMeasure)(t.groupCount||0,"INT"))),r.admin&&o.createElement(o.Fragment,null,o.createElement("td",{className:"nowrap text-middle text-right"},o.createElement(v.a,null,o.createElement(E.ActionsDropdownItem,{onClick:this.handleManageGroupsClick},Object(u.translate)("organization.members.manage_groups")),a&&o.createElement(o.Fragment,null,o.createElement(E.ActionsDropdownDivider,null),o.createElement(E.ActionsDropdownItem,{destructive:!0,onClick:this.handleRemoveMemberClick},Object(u.translate)("organization.members.remove"))))),this.state.manageGroupsForm&&o.createElement(R,{member:this.props.member,onClose:this.closeManageGroupsForm,organization:this.props.organization,organizationGroups:this.props.organizationGroups,updateMemberGroups:this.props.updateMemberGroups}),a&&this.state.removeMemberForm&&o.createElement(B,{member:this.props.member,onClose:this.closeRemoveMemberForm,organization:this.props.organization,removeMember:a})))}}class I extends o.PureComponent{render(){const e=this.props,t=e.currentUser,n=e.members;if(!n.length)return o.createElement("div",{className:"note"},Object(u.translate)("no_results"));const a=f()(n,e=>e.name,e=>e.login);return o.createElement("div",{className:"boxed-group boxed-group-inner"},o.createElement("table",{className:"data zebra"},o.createElement("tbody",null,a.map(e=>o.createElement(T,{key:e.login,member:e,organization:this.props.organization,organizationGroups:this.props.organizationGroups,removeMember:t.login!==e.login?this.props.removeMember:void 0,updateMemberGroups:this.props.updateMemberGroups})))))}}var J=n(323),K=n.n(J),H=n(358),V=n.n(H),$=n(350);function Q(e){let t=e.handleSearch,n=e.organization,a=e.total;return o.createElement("div",{className:"panel panel-vertical bordered-bottom spacer-bottom"},o.createElement(V.a,{minLength:2,onChange:t,placeholder:Object(u.translate)("search.search_for_members")}),void 0!==a&&o.createElement("span",{className:"pull-right little-spacer-top"},o.createElement("strong",null,Object(O.formatMeasure)(a,"INT"))," ",Object(u.translate)("organization.members.members"),n.alm&&n.alm.membersSync&&o.createElement(K.a,{className:"spacer-left",overlay:o.createElement("div",{className:"abs-width-300 markdown cut-margins"},o.createElement("p",null,Object(u.translate)("organization.members.auto_sync_total_help",Object($.g)(n.alm.key))),o.createElement("hr",null),o.createElement("p",null,o.createElement("a",{href:Object($.a)(n.alm.key,n.alm.url),rel:"noopener noreferrer",target:"_blank"},Object(u.translateWithParameters)("organization.members.see_all_members_on_x",Object(u.translate)(Object($.g)(n.alm.key))))))})))}var X=n(304),Y=n(28),Z=n(326),ee=n(339),te=n(362),ne=n.n(te),ae=n(338),se=n.n(ae);const re=10,oe=16;class ie extends o.PureComponent{constructor(e){super(e),this.mounted=!1,this.filterSearchResult=e=>{return e.users.filter(e=>!this.props.excludedUsers.includes(e.login)).slice(0,re)},this.filterOptions=e=>e,this.handleSearch=e=>{this.props.searchUsers(e,Math.min(this.props.excludedUsers.length+re,500)).then(this.filterSearchResult).then(e=>{this.mounted&&this.setState({isLoading:!1,searchResult:e})},()=>{this.mounted&&this.setState({isLoading:!1,searchResult:[]})})},this.handleInputChange=e=>{null==e||1===e.length?this.setState({search:e}):(this.setState({isLoading:!0,search:e}),this.handleSearch(e))},this.handleSearch=ne()(this.handleSearch,250),this.state={searchResult:[],isLoading:!1,search:""}}componentDidMount(){this.mounted=!0,this.handleSearch(this.state.search)}componentDidUpdate(e){this.props.excludedUsers!==e.excludedUsers&&this.handleSearch(this.state.search)}componentWillUnmount(){this.mounted=!1}render(){const e=1===this.state.search.length?Object(u.translateWithParameters)("select2.tooShort",2):Object(u.translate)("no_results");return o.createElement(se.a,{autoFocus:this.props.autoFocus,className:"Select-big",clearable:!1,filterOptions:this.filterOptions,isLoading:this.state.isLoading,labelKey:"name",noResultsText:e,onChange:this.props.handleValueChange,onInputChange:this.handleInputChange,optionComponent:le,options:this.state.searchResult,placeholder:"",searchable:!0,value:this.props.selectedUser,valueComponent:me,valueKey:"login"})}}class le extends o.PureComponent{constructor(){super(...arguments),this.handleMouseDown=e=>{e.preventDefault(),e.stopPropagation(),this.props.onSelect(this.props.option,e)},this.handleMouseEnter=e=>{this.props.onFocus(this.props.option,e)},this.handleMouseMove=e=>{this.props.isFocused||this.props.onFocus(this.props.option,e)}}render(){const e=this.props.option;return o.createElement("div",{className:this.props.className,onMouseDown:this.handleMouseDown,onMouseEnter:this.handleMouseEnter,onMouseMove:this.handleMouseMove,role:"listitem",title:e.name},o.createElement(z.a,{hash:e.avatar,name:e.name,size:oe}),o.createElement("strong",{className:"spacer-left"},this.props.children),o.createElement("span",{className:"note little-spacer-left"},e.login))}}function me(e){let t=e.children,n=e.value;return o.createElement("div",{className:"Select-value",title:n?n.name:""},n&&n.login&&o.createElement("div",{className:"Select-value-label"},o.createElement(z.a,{hash:n.avatar,name:n.name,size:oe}),o.createElement("strong",{className:"spacer-left"},t),o.createElement("span",{className:"note little-spacer-left"},n.login)))}class ce extends o.PureComponent{constructor(){super(...arguments),this.state={open:!1},this.openForm=()=>{this.setState({open:!0})},this.closeForm=()=>{this.setState({open:!1,selectedMember:void 0})},this.handleSearch=(e,t)=>{const n={organization:this.props.organization.key,ps:t,selected:"deselected"};return e?Object(h.j)(Object.assign({},n,{q:e})):Object(h.j)(n)},this.handleSubmit=e=>{e.preventDefault(),this.state.selectedMember&&(this.props.addMember(this.state.selectedMember),this.closeForm())},this.selectedMemberChange=e=>{this.setState({selectedMember:e})}}renderModal(){const e=Object(u.translate)("users.add");return o.createElement(W.a,{contentLabel:e,key:"add-member-modal",onRequestClose:this.closeForm},o.createElement("header",{className:"modal-head"},o.createElement("h2",null,e)),o.createElement("form",{onSubmit:this.handleSubmit},o.createElement("div",{className:"modal-body"},o.createElement("div",{className:"modal-field"},o.createElement("label",null,Object(u.translate)("users.search_description")),o.createElement(ie,{autoFocus:!0,excludedUsers:this.props.memberLogins,handleValueChange:this.selectedMemberChange,searchUsers:this.handleSearch,selectedUser:this.state.selectedMember}))),o.createElement("footer",{className:"modal-foot"},o.createElement("div",null,o.createElement(N.SubmitButton,{disabled:!this.state.selectedMember},Object(u.translate)("organization.members.add_to_members")),o.createElement(N.ResetButtonLink,{onClick:this.closeForm},Object(u.translate)("cancel"))))))}render(){return o.createElement(o.Fragment,null,o.createElement(N.Button,{key:"add-member-button",onClick:this.openForm},Object(u.translate)("organization.members.add")),this.state.open&&this.renderModal())}}var ue=n(366),he=n.n(ue),pe=n(426),de=n.n(pe);const ge={fetchOrganization:n(409).f};var be=Object(a.connect)(null,ge)(class extends o.PureComponent{constructor(e){super(e),this.handleConfirm=()=>{const e=this.props.organization,t=this.state.membersSync;return Object(h.k)({organization:e.key,enabled:t}).then(()=>(this.props.fetchOrganization(e.key),t?this.handleMemberSync():Promise.resolve()))},this.handleManualClick=()=>{this.setState({membersSync:!1})},this.handleAutoClick=()=>{this.setState({membersSync:!0})},this.handleMemberSync=()=>Object(h.l)(this.props.organization.key).then(this.props.refreshMembers),this.renderModalDescription=()=>o.createElement("p",{className:"spacer-top"},Object(u.translate)("organization.members.management.description"),o.createElement(Y.Link,{className:"spacer-left",target:"_blank",to:{pathname:"/documentation/organizations/manage-team/"}},Object(u.translate)("learn_more"))),this.renderModalBody=()=>{const e=this.state.membersSync,t=this.props,n=t.hasOtherMembers,a=t.organization,s=a.alm&&Object($.g)(a.alm.key),r=n&&a.alm&&!a.alm.membersSync;return o.createElement("div",{className:"display-flex-stretch big-spacer-top"},o.createElement(de.a,{onClick:this.handleManualClick,selected:!e,title:Object(u.translate)("organization.members.management.manual")},o.createElement("div",{className:"spacer-left"},o.createElement("ul",{className:"big-spacer-left note"},o.createElement("li",{className:"spacer-bottom"},Object(u.translate)("organization.members.management.manual.add_members_manually")),o.createElement("li",null,Object(u.translate)("organization.members.management.choose_members_permissions"))))),o.createElement(de.a,{onClick:this.handleAutoClick,selected:e,title:Object(u.translateWithParameters)("organization.members.management.automatic",Object(u.translate)(s||""))},o.createElement("div",{className:"spacer-left"},o.createElement("ul",{className:"big-spacer-left note"},s&&o.createElement(o.Fragment,null,o.createElement("li",{className:"spacer-bottom"},Object(u.translateWithParameters)("organization.members.management.automatic.synchronized_from_x",Object(u.translate)("organization",s))),o.createElement("li",{className:"spacer-bottom"},Object(u.translate)("organization.members.management.automatic.members_changes_reflected",s))),o.createElement("li",null,Object(u.translate)("organization.members.management.choose_members_permissions")))),s&&r&&o.createElement(Z.Alert,{className:"big-spacer-top",variant:"warning"},Object(u.translateWithParameters)("organization.members.management.automatic.warning_x",Object(u.translate)("organization",s)))))},this.state={membersSync:Boolean(e.organization.alm&&e.organization.alm.membersSync)}}render(){const e=this.props.organization,t=Boolean(e.alm&&e.alm.membersSync);return o.createElement(he.a,{cancelButtonText:Object(u.translate)("close"),confirmButtonText:Object(u.translate)("save"),confirmDisable:this.state.membersSync===t,modalBody:this.renderModalBody(),modalHeader:Object(u.translate)("organization.members.management.title"),modalHeaderDescription:this.renderModalDescription(),onConfirm:this.handleConfirm,size:"medium"},e=>{let t=e.onClick;return o.createElement(N.Button,{onClick:t},this.props.buttonText)})}});function fe(e){const t=e.members,a=e.organization,s=e.refreshMembers,r=t?t.map(e=>e.login):[],i=a.actions&&a.actions.admin,l=a.alm&&Object($.g)(a.alm.key),m=a.alm&&a.alm.membersSync,c=i&&a.alm&&!m,h=l&&Object($.e)(l)&&a.alm&&!a.alm.personal;return o.createElement("header",{className:"page-header"},o.createElement("h1",{className:"page-title"},Object(u.translate)("organization.members.page"),o.createElement(G.a,{className:"little-spacer-left",loading:e.loading})),i&&o.createElement("div",{className:"page-actions text-right"},h&&!c&&o.createElement(be,{buttonText:Object(u.translate)("organization.members.config_synchro"),hasOtherMembers:t&&t.length>1,organization:a,refreshMembers:s}),!m&&o.createElement("div",{className:"display-inline-block spacer-left spacer-bottom"},o.createElement(ce,{addMember:e.handleAddMember,memberLogins:r,organization:a}),o.createElement(ee.a,{className:"spacer-left",doc:Promise.resolve().then(n.bind(null,1633))}))),o.createElement("div",{className:"page-description"},o.createElement(X.FormattedMessage,{defaultMessage:Object(u.translate)("organization.members.page.description"),id:"organization.members.page.description",values:{link:o.createElement(Y.Link,{target:"_blank",to:"/documentation/organizations/manage-team/"},Object(u.translate)("organization.members.manage_a_team"))}}),l&&h&&c&&o.createElement(Z.Alert,{className:"spacer-top",display:"inline",variant:"info"},Object(u.translateWithParameters)("organization.members.auto_sync_members_from_org_x",Object(u.translate)("organization",l)),o.createElement("span",{className:"spacer-left"},o.createElement(be,{buttonText:Object(u.translate)("configure"),hasOtherMembers:t&&t.length>1,organization:a,refreshMembers:s})))))}const Ee=50;t.default=Object(s.a)(Object(a.connect)((e,t)=>({organization:Object(r.getOrganizationByKey)(e,t.params.organizationKey)}))(class extends o.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={groups:[],loading:!0,query:""},this.stopLoading=()=>{this.mounted&&this.setState({loading:!1})},this.fetchMembers=e=>{this.setState({loading:!0}),Object(h.j)({organization:this.props.organization.key,ps:Ee,q:e}).then(e=>{let t=e.paging,n=e.users;this.mounted&&this.setState({loading:!1,members:n,paging:t})},this.stopLoading)},this.fetchGroups=()=>{Object(p.f)({organization:this.props.organization.key}).then(e=>{let t=e.groups;this.mounted&&this.setState({groups:t})},()=>{})},this.handleSearchMembers=e=>{this.setState({query:e}),this.fetchMembers(e||void 0)},this.handleLoadMoreMembers=()=>{const e=this.state,t=e.paging,n=e.query;t&&(this.setState({loading:!0}),Object(h.j)({organization:this.props.organization.key,p:t.pageIndex+1,ps:Ee,q:n||void 0}).then(e=>{let t=e.paging,n=e.users;this.mounted&&this.setState(e=>{let a=e.members;return{loading:!1,members:[...void 0===a?[]:a,...n],paging:t}})},this.stopLoading))},this.handleAddMember=e=>{let t=e.login;Object(h.a)({login:t,organization:this.props.organization.key}).then(e=>{this.mounted&&this.setState(t=>{let n=t.members,a=t.paging;return{members:n&&[...n,e],paging:a&&Object.assign({},a,{total:a.total+1})}})},()=>{})},this.handleRemoveMember=e=>{let t=e.login;Object(h.i)({login:t,organization:this.props.organization.key}).then(()=>{this.mounted&&this.setState(e=>{let n=e.members,a=e.paging;return{members:n&&n.filter(e=>e.login!==t),paging:a&&Object.assign({},a,{total:a.total-1})}})},()=>{})},this.refreshMembers=()=>Object(h.j)({organization:this.props.organization.key,ps:Ee,q:this.state.query||void 0}).then(e=>{let t=e.paging,n=e.users;this.mounted&&this.setState({members:n,paging:t})}),this.updateGroup=(e,t)=>{this.setState(n=>{let a=n.members;return{members:a&&a.map(n=>n.login===e?t(n):n)}})},this.updateMemberGroups=(e,t,n)=>{let a=e.login;const s=[...t.map(e=>Object(p.a)({name:e,login:a,organization:this.props.organization.key})),...n.map(e=>Object(p.e)({name:e,login:a,organization:this.props.organization.key}))];return Promise.all(s).then(()=>{this.mounted&&this.updateGroup(a,e=>Object.assign({},e,{groupCount:(e.groupCount||0)+t.length-n.length}))})}}componentDidMount(){this.mounted=!0,this.fetchMembers(),this.props.organization.actions&&this.props.organization.actions.admin&&this.fetchGroups()}componentWillUnmount(){this.mounted=!1}render(){const e=this.props,t=e.currentUser,n=e.organization,a=this.state,s=a.groups,r=a.loading,i=a.members,m=a.paging,h=n.alm&&n.alm.membersSync;return o.createElement("div",{className:"page page-limited"},o.createElement(l.a,{title:Object(u.translate)("organization.members.page")}),o.createElement(g.a,{suggestions:"organization_members"}),o.createElement(d.a,{anchor:"members_main"}),o.createElement(fe,{handleAddMember:this.handleAddMember,loading:r,members:i,organization:n,refreshMembers:this.refreshMembers}),void 0!==i&&void 0!==m&&o.createElement(o.Fragment,null,o.createElement(Q,{handleSearch:this.handleSearchMembers,organization:n,total:m.total}),o.createElement(I,{currentUser:t,members:i,organization:n,organizationGroups:s,removeMember:h?void 0:this.handleRemoveMember,updateMemberGroups:this.updateMemberGroups}),0!==m.total&&o.createElement(c.a,{count:i.length,loadMore:this.handleLoadMoreMembers,ready:!r,total:m.total})))}}))},330:function(e,t,n){"use strict";n.d(t,"a",function(){return r});var a=n(2),s=n(349);function r(e){let t=e.suggestions;return a.createElement(s.a.Consumer,null,e=>{let n=e.addSuggestions,s=e.removeSuggestions;return a.createElement(o,{addSuggestions:n,removeSuggestions:s,suggestions:t})})}class o extends a.PureComponent{componentDidMount(){this.props.addSuggestions(this.props.suggestions)}componentDidUpdate(e){e.suggestions!==this.props.suggestions&&(this.props.removeSuggestions(this.props.suggestions),this.props.addSuggestions(e.suggestions))}componentWillUnmount(){this.props.removeSuggestions(this.props.suggestions)}render(){return null}}},339:function(e,t,n){"use strict";n.d(t,"a",function(){return m});var a=n(2),s=n(323),r=n.n(s),o=n(321),i=n(364);const l=Object(o.lazyLoad)(()=>Promise.all([n.e(6),n.e(19)]).then(n.bind(null,456)));class m extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={open:!1},this.close=()=>{this.mounted&&this.setState({open:!1})}}componentDidMount(){this.mounted=!0,this.props.doc.then(e=>{let t=e.default;this.mounted&&this.setState({content:t})},()=>{}),document.addEventListener("scroll",this.close,!0)}componentWillUnmount(){this.mounted=!1,document.removeEventListener("scroll",this.close,!0)}render(){return this.state.content?a.createElement(r.a,{className:this.props.className,overlay:a.createElement("div",{className:"abs-width-300"},a.createElement(l,{childProps:this.props.overlayProps,className:"cut-margins",content:Object(i.filterContent)(this.state.content),isTooltip:!0}))},this.props.children):this.props.children||null}}},343:function(e,t,n){"use strict";n.d(t,"a",function(){return o});var a=n(2),s=n(5),r=n(399);function o(e){return a.createElement(r.a.Consumer,null,t=>{let n=t.addA11ySkipLink,s=t.removeA11ySkipLink;return a.createElement(i,Object.assign({addA11ySkipLink:n,removeA11ySkipLink:s},e))})}class i extends a.PureComponent{constructor(){super(...arguments),this.getLink=()=>{const e=this.props,t=e.anchor,n=e.label;return{key:t,label:void 0===n?Object(s.translate)("skip_to_content"):n,weight:e.weight}}}componentDidMount(){this.props.addA11ySkipLink(this.getLink())}componentWillUnmount(){this.props.removeA11ySkipLink(this.getLink())}render(){const e=this.props.anchor;return a.createElement("span",{id:"a11y_target__".concat(e)})}}},350:function(e,t,n){"use strict";n.d(t,"a",function(){return s}),n.d(t,"b",function(){return r}),n.d(t,"c",function(){return o}),n.d(t,"d",function(){return i}),n.d(t,"e",function(){return l}),n.d(t,"f",function(){return m}),n.d(t,"g",function(){return c});var a=n(329);function s(e,t){return t.endsWith("/")||(t+="/"),l(e)?t.replace("github.com/","github.com/orgs/")+"people":t+"profile/members"}function r(e){return Object(a.b)(e)&&e.externalProvider?c(e.externalProvider):void 0}function o(e){return Object(a.b)(e)&&(i(e.externalProvider)||l(e.externalProvider))}function i(e){return!!e&&e.startsWith("bitbucket")}function l(e){return"github"===e}function m(e){return"microsoft"===e}function c(e){return i(e)?"bitbucket":e}},364:function(e,t,n){"use strict";function a(e){let t,n;for(let a=0;a<e.length;a++){if("---"===e[a].trim()){if(void 0!==t){n=a;break}t=a}}return void 0!==n?{firstLine:t,lastLine:n}:void 0}function s(e){const t={};for(let n=0;n<e.length;n++){const a=e[n].split(":").map(e=>e.trim());2===a.length&&(t[a[0]]=a[1])}return t}function r(e,t){const n="\x3c!-- ".concat(t," --\x3e"),a="\x3c!-- /".concat(t," --\x3e");let s=e,r=s.indexOf(n),o=s.indexOf(a);for(;-1!==r&&-1!==o;)r=(s=s.substring(0,r)+s.substring(o+a.length)).indexOf(n),o=s.indexOf(a);return s}e.exports={getFrontMatter:function(e){const t=e.split("\n"),n=a(t);return n?s(t.slice(n.firstLine+1,n.lastLine)):{}},separateFrontMatter:function(e){const t=e.split("\n"),n=a(t);if(n){const e=s(t.slice(n.firstLine+1,n.lastLine)),a=t.slice(n.lastLine+1).join("\n");return{frontmatter:e,content:a}}return{frontmatter:{},content:e}},filterContent:function(e){const t="\x3c!-- \\/?(sonarqube|sonarcloud|static) --\x3e",a=n(22),s=a.isSonarCloud,o=a.getInstance,i=r(e.replace(/{instance}/gi,o()),"static");return(s()?r(i,"sonarqube"):r(i,"sonarcloud")).replace(new RegExp("^".concat(t,"(\n|\r|\r\n|$)"),"gm"),"").replace(new RegExp("".concat(t),"g"),"")}}},676:function(e,t,n){"use strict";n.d(t,"f",function(){return r}),n.d(t,"d",function(){return o}),n.d(t,"a",function(){return i}),n.d(t,"e",function(){return l}),n.d(t,"b",function(){return m}),n.d(t,"g",function(){return c}),n.d(t,"c",function(){return u});var a=n(8),s=n(320);function r(e){return Object(a.getJSON)("/api/user_groups/search",e).catch(s.a)}function o(e){return Object(a.getJSON)("/api/user_groups/users",e).catch(s.a)}function i(e){return Object(a.post)("/api/user_groups/add_user",e).catch(s.a)}function l(e){return Object(a.post)("/api/user_groups/remove_user",e).catch(s.a)}function m(e){return Object(a.postJSON)("/api/user_groups/create",e).then(e=>e.group,s.a)}function c(e){return Object(a.post)("/api/user_groups/update",e).catch(s.a)}function u(e){return Object(a.post)("/api/user_groups/delete",e).catch(s.a)}}}]);
//# sourceMappingURL=333.m.2a147f2d.chunk.js.map