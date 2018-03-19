
package com.sendwordnow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sendwordnow package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteGroupResult_QNAME = new QName("http://www.sendwordnow.com", "deleteGroupResult");
    private final static QName _IsContactInGroupResult_QNAME = new QName("http://www.sendwordnow.com", "isContactInGroupResult");
    private final static QName _PGrpUpdReq_QNAME = new QName("http://www.sendwordnow.com", "pGrpUpdReq");
    private final static QName _GetGroupSummaryResult_QNAME = new QName("http://www.sendwordnow.com", "getGroupSummaryResult");
    private final static QName _ActionContactsGroupResponse_QNAME = new QName("http://www.sendwordnow.com", "actionContactsGroupResponse");
    private final static QName _Details_QNAME = new QName("http://www.sendwordnow.com", "Details");
    private final static QName _ActionContactsGroup_QNAME = new QName("http://www.sendwordnow.com", "actionContactsGroup");
    private final static QName _GetGroupDetailResult_QNAME = new QName("http://www.sendwordnow.com", "getGroupDetailResult");
    private final static QName _UpdateGroupResult_QNAME = new QName("http://www.sendwordnow.com", "updateGroupResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sendwordnow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrpUpdReq }
     * 
     */
    public GrpUpdReq createGrpUpdReq() {
        return new GrpUpdReq();
    }

    /**
     * Create an instance of {@link GrpDetail }
     * 
     */
    public GrpDetail createGrpDetail() {
        return new GrpDetail();
    }

    /**
     * Create an instance of {@link ActionContactsGroup }
     * 
     */
    public ActionContactsGroup createActionContactsGroup() {
        return new ActionContactsGroup();
    }

    /**
     * Create an instance of {@link ObjActionResult }
     * 
     */
    public ObjActionResult createObjActionResult() {
        return new ObjActionResult();
    }

    /**
     * Create an instance of {@link GrpSummary }
     * 
     */
    public GrpSummary createGrpSummary() {
        return new GrpSummary();
    }

    /**
     * Create an instance of {@link ContactGrpSummary }
     * 
     */
    public ContactGrpSummary createContactGrpSummary() {
        return new ContactGrpSummary();
    }

    /**
     * Create an instance of {@link GetGroupsResponse }
     * 
     */
    public GetGroupsResponse createGetGroupsResponse() {
        return new GetGroupsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGrpSummary }
     * 
     */
    public ArrayOfGrpSummary createArrayOfGrpSummary() {
        return new ArrayOfGrpSummary();
    }

    /**
     * Create an instance of {@link GetOTIDResponse }
     * 
     */
    public GetOTIDResponse createGetOTIDResponse() {
        return new GetOTIDResponse();
    }

    /**
     * Create an instance of {@link CreateContacts }
     * 
     */
    public CreateContacts createCreateContacts() {
        return new CreateContacts();
    }

    /**
     * Create an instance of {@link ArrayOfContactDetail1 }
     * 
     */
    public ArrayOfContactDetail1 createArrayOfContactDetail1() {
        return new ArrayOfContactDetail1();
    }

    /**
     * Create an instance of {@link UpdateGroup }
     * 
     */
    public UpdateGroup createUpdateGroup() {
        return new UpdateGroup();
    }

    /**
     * Create an instance of {@link GetGroupDetailResponse }
     * 
     */
    public GetGroupDetailResponse createGetGroupDetailResponse() {
        return new GetGroupDetailResponse();
    }

    /**
     * Create an instance of {@link GetGroupSummaryResponse }
     * 
     */
    public GetGroupSummaryResponse createGetGroupSummaryResponse() {
        return new GetGroupSummaryResponse();
    }

    /**
     * Create an instance of {@link DeleteContacts }
     * 
     */
    public DeleteContacts createDeleteContacts() {
        return new DeleteContacts();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link GetOTID }
     * 
     */
    public GetOTID createGetOTID() {
        return new GetOTID();
    }

    /**
     * Create an instance of {@link GetGroupDetail }
     * 
     */
    public GetGroupDetail createGetGroupDetail() {
        return new GetGroupDetail();
    }

    /**
     * Create an instance of {@link DeleteGroupResponse }
     * 
     */
    public DeleteGroupResponse createDeleteGroupResponse() {
        return new DeleteGroupResponse();
    }

    /**
     * Create an instance of {@link GetContactDetail }
     * 
     */
    public GetContactDetail createGetContactDetail() {
        return new GetContactDetail();
    }

    /**
     * Create an instance of {@link DeleteGroup }
     * 
     */
    public DeleteGroup createDeleteGroup() {
        return new DeleteGroup();
    }

    /**
     * Create an instance of {@link UpdateContact }
     * 
     */
    public UpdateContact createUpdateContact() {
        return new UpdateContact();
    }

    /**
     * Create an instance of {@link ContactDetail }
     * 
     */
    public ContactDetail createContactDetail() {
        return new ContactDetail();
    }

    /**
     * Create an instance of {@link IsContactInGroupResponse }
     * 
     */
    public IsContactInGroupResponse createIsContactInGroupResponse() {
        return new IsContactInGroupResponse();
    }

    /**
     * Create an instance of {@link GetGroups }
     * 
     */
    public GetGroups createGetGroups() {
        return new GetGroups();
    }

    /**
     * Create an instance of {@link CreateGroup }
     * 
     */
    public CreateGroup createCreateGroup() {
        return new CreateGroup();
    }

    /**
     * Create an instance of {@link GrpCreateReq }
     * 
     */
    public GrpCreateReq createGrpCreateReq() {
        return new GrpCreateReq();
    }

    /**
     * Create an instance of {@link IsContactInGroup }
     * 
     */
    public IsContactInGroup createIsContactInGroup() {
        return new IsContactInGroup();
    }

    /**
     * Create an instance of {@link IsContactInAccount }
     * 
     */
    public IsContactInAccount createIsContactInAccount() {
        return new IsContactInAccount();
    }

    /**
     * Create an instance of {@link UpdateContactResponse }
     * 
     */
    public UpdateContactResponse createUpdateContactResponse() {
        return new UpdateContactResponse();
    }

    /**
     * Create an instance of {@link ArrayOfObjActionResult }
     * 
     */
    public ArrayOfObjActionResult createArrayOfObjActionResult() {
        return new ArrayOfObjActionResult();
    }

    /**
     * Create an instance of {@link GetContactDetailResponse }
     * 
     */
    public GetContactDetailResponse createGetContactDetailResponse() {
        return new GetContactDetailResponse();
    }

    /**
     * Create an instance of {@link ActionContactsGroupResponse }
     * 
     */
    public ActionContactsGroupResponse createActionContactsGroupResponse() {
        return new ActionContactsGroupResponse();
    }

    /**
     * Create an instance of {@link ArrayOfObjActionResultDetailInfo }
     * 
     */
    public ArrayOfObjActionResultDetailInfo createArrayOfObjActionResultDetailInfo() {
        return new ArrayOfObjActionResultDetailInfo();
    }

    /**
     * Create an instance of {@link GetTxtMsgCarriersResponse }
     * 
     */
    public GetTxtMsgCarriersResponse createGetTxtMsgCarriersResponse() {
        return new GetTxtMsgCarriersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTxtMsgCarrier }
     * 
     */
    public ArrayOfTxtMsgCarrier createArrayOfTxtMsgCarrier() {
        return new ArrayOfTxtMsgCarrier();
    }

    /**
     * Create an instance of {@link GetGroupSummary }
     * 
     */
    public GetGroupSummary createGetGroupSummary() {
        return new GetGroupSummary();
    }

    /**
     * Create an instance of {@link DeleteContactsResponse }
     * 
     */
    public DeleteContactsResponse createDeleteContactsResponse() {
        return new DeleteContactsResponse();
    }

    /**
     * Create an instance of {@link CreateGroupResponse }
     * 
     */
    public CreateGroupResponse createCreateGroupResponse() {
        return new CreateGroupResponse();
    }

    /**
     * Create an instance of {@link UpdateGroupResponse }
     * 
     */
    public UpdateGroupResponse createUpdateGroupResponse() {
        return new UpdateGroupResponse();
    }

    /**
     * Create an instance of {@link IsContactInAccountResponse }
     * 
     */
    public IsContactInAccountResponse createIsContactInAccountResponse() {
        return new IsContactInAccountResponse();
    }

    /**
     * Create an instance of {@link GetTxtMsgCarriers }
     * 
     */
    public GetTxtMsgCarriers createGetTxtMsgCarriers() {
        return new GetTxtMsgCarriers();
    }

    /**
     * Create an instance of {@link CreateContactsResponse }
     * 
     */
    public CreateContactsResponse createCreateContactsResponse() {
        return new CreateContactsResponse();
    }

    /**
     * Create an instance of {@link ContactDetailContactPointsListEmailTextMsgContactPnt }
     * 
     */
    public ContactDetailContactPointsListEmailTextMsgContactPnt createContactDetailContactPointsListEmailTextMsgContactPnt() {
        return new ContactDetailContactPointsListEmailTextMsgContactPnt();
    }

    /**
     * Create an instance of {@link ContactDetailContactPointsList }
     * 
     */
    public ContactDetailContactPointsList createContactDetailContactPointsList() {
        return new ContactDetailContactPointsList();
    }

    /**
     * Create an instance of {@link ArrayOfContactDetail }
     * 
     */
    public ArrayOfContactDetail createArrayOfContactDetail() {
        return new ArrayOfContactDetail();
    }

    /**
     * Create an instance of {@link ContactPntEmailType }
     * 
     */
    public ContactPntEmailType createContactPntEmailType() {
        return new ContactPntEmailType();
    }

    /**
     * Create an instance of {@link ArrayOfContactSummary }
     * 
     */
    public ArrayOfContactSummary createArrayOfContactSummary() {
        return new ArrayOfContactSummary();
    }

    /**
     * Create an instance of {@link ContactSummary }
     * 
     */
    public ContactSummary createContactSummary() {
        return new ContactSummary();
    }

    /**
     * Create an instance of {@link ObjActionResultDetailInfo }
     * 
     */
    public ObjActionResultDetailInfo createObjActionResultDetailInfo() {
        return new ObjActionResultDetailInfo();
    }

    /**
     * Create an instance of {@link ArrayOfGrpName }
     * 
     */
    public ArrayOfGrpName createArrayOfGrpName() {
        return new ArrayOfGrpName();
    }

    /**
     * Create an instance of {@link ContactPntVoiceType }
     * 
     */
    public ContactPntVoiceType createContactPntVoiceType() {
        return new ContactPntVoiceType();
    }

    /**
     * Create an instance of {@link GrpCreateReqContactsList }
     * 
     */
    public GrpCreateReqContactsList createGrpCreateReqContactsList() {
        return new GrpCreateReqContactsList();
    }

    /**
     * Create an instance of {@link TxtMsgCarrier }
     * 
     */
    public TxtMsgCarrier createTxtMsgCarrier() {
        return new TxtMsgCarrier();
    }

    /**
     * Create an instance of {@link ContactDetailLogin }
     * 
     */
    public ContactDetailLogin createContactDetailLogin() {
        return new ContactDetailLogin();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link ContactPntTextMsgType }
     * 
     */
    public ContactPntTextMsgType createContactPntTextMsgType() {
        return new ContactPntTextMsgType();
    }

    /**
     * Create an instance of {@link GrpActionContactsReq }
     * 
     */
    public GrpActionContactsReq createGrpActionContactsReq() {
        return new GrpActionContactsReq();
    }

    /**
     * Create an instance of {@link GrpUpdReq.NewDesc }
     * 
     */
    public GrpUpdReq.NewDesc createGrpUpdReqNewDesc() {
        return new GrpUpdReq.NewDesc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjActionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "deleteGroupResult")
    public JAXBElement<ObjActionResult> createDeleteGroupResult(ObjActionResult value) {
        return new JAXBElement<ObjActionResult>(_DeleteGroupResult_QNAME, ObjActionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactGrpSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "isContactInGroupResult")
    public JAXBElement<ContactGrpSummary> createIsContactInGroupResult(ContactGrpSummary value) {
        return new JAXBElement<ContactGrpSummary>(_IsContactInGroupResult_QNAME, ContactGrpSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrpUpdReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "pGrpUpdReq")
    public JAXBElement<GrpUpdReq> createPGrpUpdReq(GrpUpdReq value) {
        return new JAXBElement<GrpUpdReq>(_PGrpUpdReq_QNAME, GrpUpdReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrpSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "getGroupSummaryResult")
    public JAXBElement<GrpSummary> createGetGroupSummaryResult(GrpSummary value) {
        return new JAXBElement<GrpSummary>(_GetGroupSummaryResult_QNAME, GrpSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionContactsGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "actionContactsGroupResponse")
    public JAXBElement<ActionContactsGroupResponse> createActionContactsGroupResponse(ActionContactsGroupResponse value) {
        return new JAXBElement<ActionContactsGroupResponse>(_ActionContactsGroupResponse_QNAME, ActionContactsGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjActionResultDetailInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "Details")
    public JAXBElement<ArrayOfObjActionResultDetailInfo> createDetails(ArrayOfObjActionResultDetailInfo value) {
        return new JAXBElement<ArrayOfObjActionResultDetailInfo>(_Details_QNAME, ArrayOfObjActionResultDetailInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionContactsGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "actionContactsGroup")
    public JAXBElement<ActionContactsGroup> createActionContactsGroup(ActionContactsGroup value) {
        return new JAXBElement<ActionContactsGroup>(_ActionContactsGroup_QNAME, ActionContactsGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrpDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "getGroupDetailResult")
    public JAXBElement<GrpDetail> createGetGroupDetailResult(GrpDetail value) {
        return new JAXBElement<GrpDetail>(_GetGroupDetailResult_QNAME, GrpDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjActionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com", name = "updateGroupResult")
    public JAXBElement<ObjActionResult> createUpdateGroupResult(ObjActionResult value) {
        return new JAXBElement<ObjActionResult>(_UpdateGroupResult_QNAME, ObjActionResult.class, null, value);
    }

}
