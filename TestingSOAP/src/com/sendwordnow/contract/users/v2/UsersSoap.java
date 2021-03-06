
package com.sendwordnow.contract.users.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.sendwordnow.ContactGrpSummary;
import com.sendwordnow.GrpActionContactsReq;
import com.sendwordnow.GrpDetail;
import com.sendwordnow.GrpSummary;
import com.sendwordnow.GrpUpdReq;
import com.sendwordnow.schema.users.v2.ArrayOfContactLocationLabel;
import com.sendwordnow.schema.users.v2.ContactDetail;
import com.sendwordnow.schema.users.v2.GrpCreateReq;
import com.sendwordnow.schema.users.v2.SimpleResults;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsersSoap", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
@XmlSeeAlso({
    com.sendwordnow.schema.users.v2.ObjectFactory.class,
    com.sendwordnow.ObjectFactory.class,
    com.sendwordnow.contract.users.v2.ObjectFactory.class
})
public interface UsersSoap {


    /**
     * Method to test connectivity
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Echo", action = "http://www.sendwordnow.com/contract/users/v2/Echo")
    @WebResult(name = "EchoResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "Echo", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.Echo")
    @ResponseWrapper(localName = "EchoResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.EchoResponse")
    public String echo(
        @WebParam(name = "value", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String value);

    /**
     * Method to test authentication
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EchoAuthenticated", action = "http://www.sendwordnow.com/contract/users/v2/EchoAuthenticated")
    @WebResult(name = "EchoAuthenticatedResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "EchoAuthenticated", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.EchoAuthenticated")
    @ResponseWrapper(localName = "EchoAuthenticatedResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.EchoAuthenticatedResponse")
    public String echoAuthenticated(
        @WebParam(name = "value", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String value);

    /**
     * Get One-time ID.
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getOTID")
    @WebResult(name = "getOTIDResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getOTID", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetOTID")
    @ResponseWrapper(localName = "getOTIDResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetOTIDResponse")
    public String getOTID();

    /**
     * Get my list of groups.
     * 
     * @param filterDynamicGroups
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfGrpSummary
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getGroups")
    @WebResult(name = "getGroupsResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getGroups", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGroups")
    @ResponseWrapper(localName = "getGroupsResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGroupsResponse")
    public ArrayOfGrpSummary getGroups(
        @WebParam(name = "filterDynamicGroups", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        Boolean filterDynamicGroups);

    /**
     * Create a group.
     * 
     * @param grpCreateReq
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/createGroup")
    @WebResult(name = "createGroupResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "createGroup", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.CreateGroup")
    @ResponseWrapper(localName = "createGroupResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.CreateGroupResponse")
    public com.sendwordnow.contract.users.v2.ArrayOfObjActionResult createGroup(
        @WebParam(name = "GrpCreateReq", targetNamespace = "http://www.sendwordnow.com/schema/users/v2")
        GrpCreateReq grpCreateReq);

    /**
     * Delete a group.
     * 
     * @param pGrpName
     * @return
     *     returns com.sendwordnow.ObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/deleteGroup")
    @WebResult(name = "deleteGroupResult", targetNamespace = "http://www.sendwordnow.com")
    @RequestWrapper(localName = "deleteGroup", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.DeleteGroup")
    @ResponseWrapper(localName = "deleteGroupResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.DeleteGroupResponse")
    public com.sendwordnow.ObjActionResult deleteGroup(
        @WebParam(name = "pGrpName", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pGrpName);

    /**
     * Update a group.
     * 
     * @param pGrpUpdReq
     * @return
     *     returns com.sendwordnow.ObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/updateGroup")
    @WebResult(name = "updateGroupResult", targetNamespace = "http://www.sendwordnow.com")
    @RequestWrapper(localName = "updateGroup", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.UpdateGroup")
    @ResponseWrapper(localName = "updateGroupResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.UpdateGroupResponse")
    public com.sendwordnow.ObjActionResult updateGroup(
        @WebParam(name = "pGrpUpdReq", targetNamespace = "http://www.sendwordnow.com")
        GrpUpdReq pGrpUpdReq);

    /**
     * Retrieve group's detail.
     * 
     * @param pGrpName
     * @return
     *     returns com.sendwordnow.GrpDetail
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getGroupDetail")
    @WebResult(name = "getGroupDetailResult", targetNamespace = "http://www.sendwordnow.com")
    @RequestWrapper(localName = "getGroupDetail", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGroupDetail")
    @ResponseWrapper(localName = "getGroupDetailResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGroupDetailResponse")
    public GrpDetail getGroupDetail(
        @WebParam(name = "pGrpName", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pGrpName);

    /**
     * Retrieve group's summary.
     * 
     * @param pGrpName
     * @return
     *     returns com.sendwordnow.GrpSummary
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getGroupSummary")
    @WebResult(name = "getGroupSummaryResult", targetNamespace = "http://www.sendwordnow.com")
    @RequestWrapper(localName = "getGroupSummary", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGroupSummary")
    @ResponseWrapper(localName = "getGroupSummaryResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGroupSummaryResponse")
    public GrpSummary getGroupSummary(
        @WebParam(name = "pGrpName", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pGrpName);

    /**
     * Verify if a contact belongs to a group.
     * 
     * @param pGrpName
     * @param pContactId
     * @return
     *     returns com.sendwordnow.ContactGrpSummary
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/isContactInGroup")
    @WebResult(name = "isContactInGroupResult", targetNamespace = "http://www.sendwordnow.com")
    @RequestWrapper(localName = "isContactInGroup", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.IsContactInGroup")
    @ResponseWrapper(localName = "isContactInGroupResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.IsContactInGroupResponse")
    public ContactGrpSummary isContactInGroup(
        @WebParam(name = "pGrpName", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pGrpName,
        @WebParam(name = "pContactId", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pContactId);

    /**
     * Allows contacts to be added to/removed from a group.
     * 
     * @param pInfo
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/actionContactsGroup")
    @WebResult(name = "actionContactsGroupResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "actionContactsGroup", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.ActionContactsGroup")
    @ResponseWrapper(localName = "actionContactsGroupResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.ActionContactsGroupResponse")
    public com.sendwordnow.contract.users.v2.ArrayOfObjActionResult actionContactsGroup(
        @WebParam(name = "pInfo", targetNamespace = "http://www.sendwordnow.com")
        GrpActionContactsReq pInfo);

    /**
     * Method to create Contacts. Use actionContactsGroup method to add new Contacts to an existing Group.
     * 
     * @param contacts
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/createContacts")
    @WebResult(name = "createContactsResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "createContacts", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.CreateContacts")
    @ResponseWrapper(localName = "createContactsResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.CreateContactsResponse")
    public com.sendwordnow.contract.users.v2.ArrayOfObjActionResult createContacts(
        @WebParam(name = "contacts", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        ArrayOfContactDetail contacts);

    /**
     * Retrieve contact's detail.
     * 
     * @param pId
     * @return
     *     returns com.sendwordnow.schema.users.v2.ContactDetail
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getContactDetail")
    @WebResult(name = "getContactDetailResult", targetNamespace = "http://www.sendwordnow.com/schema/users/v2")
    @RequestWrapper(localName = "getContactDetail", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactDetail")
    @ResponseWrapper(localName = "getContactDetailResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactDetailResponse")
    public ContactDetail getContactDetail(
        @WebParam(name = "pId", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pId);

    /**
     * Update a contact.
     * 
     * @param contactDetail
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/updateContact")
    @WebResult(name = "updateContactResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "updateContact", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.UpdateContact")
    @ResponseWrapper(localName = "updateContactResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.UpdateContactResponse")
    public com.sendwordnow.contract.users.v2.ArrayOfObjActionResult updateContact(
        @WebParam(name = "ContactDetail", targetNamespace = "http://www.sendwordnow.com/schema/users/v2")
        ContactDetail contactDetail);

    /**
     * Get list of Text Message Carriers supported by SWN.
     * 
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfTxtMsgCarrier
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getTxtMsgCarriers")
    @WebResult(name = "getTxtMsgCarriersResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getTxtMsgCarriers", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetTxtMsgCarriers")
    @ResponseWrapper(localName = "getTxtMsgCarriersResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetTxtMsgCarriersResponse")
    public ArrayOfTxtMsgCarrier getTxtMsgCarriers();

    /**
     * Delete contacts from account.
     * 
     * @param pContacts
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/deleteContacts")
    @WebResult(name = "deleteContactsResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "deleteContacts", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.DeleteContacts")
    @ResponseWrapper(localName = "deleteContactsResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.DeleteContactsResponse")
    public com.sendwordnow.contract.users.v2.ArrayOfObjActionResult deleteContacts(
        @WebParam(name = "pContacts", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        ArrayOfString pContacts);

    /**
     * Verify if a contact belongs to an account.
     * 
     * @param pContact
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/isContactInAccount")
    @WebResult(name = "isContactInAccountResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "isContactInAccount", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.IsContactInAccount")
    @ResponseWrapper(localName = "isContactInAccountResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.IsContactInAccountResponse")
    public boolean isContactInAccount(
        @WebParam(name = "pContact", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String pContact);

    /**
     * Get list of Time Zones supported by SWN.
     * 
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfTimeZone
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getTimeZones")
    @WebResult(name = "getTimeZonesResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getTimeZones", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetTimeZones")
    @ResponseWrapper(localName = "getTimeZonesResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetTimeZonesResponse")
    public ArrayOfTimeZone getTimeZones();

    /**
     * Sets Contact Custom Fields definition in Account.
     * 
     * @param definition
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfObjActionResult2
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/setContactCustomFieldsDefinition")
    @WebResult(name = "setContactCustomFieldsDefinitionResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "setContactCustomFieldsDefinition", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.SetContactCustomFieldsDefinition")
    @ResponseWrapper(localName = "setContactCustomFieldsDefinitionResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.SetContactCustomFieldsDefinitionResponse")
    public ArrayOfObjActionResult2 setContactCustomFieldsDefinition(
        @WebParam(name = "Definition", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        ArrayOfContactCustomFieldDefinition definition);

    /**
     * Gets Contact Custom Fields definition in Account.
     * 
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfContactCustomFieldDefinition
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getContactCustomFieldsDefinition")
    @WebResult(name = "getContactCustomFieldsDefinitionResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getContactCustomFieldsDefinition", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactCustomFieldsDefinition")
    @ResponseWrapper(localName = "getContactCustomFieldsDefinitionResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactCustomFieldsDefinitionResponse")
    public ArrayOfContactCustomFieldDefinition getContactCustomFieldsDefinition();

    /**
     * Returns all the voice labels with their global voice cascade order.
     * 
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfString
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getGlobalVoiceCascadeOrder")
    @WebResult(name = "getGlobalVoiceCascadeOrderResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getGlobalVoiceCascadeOrder", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGlobalVoiceCascadeOrder")
    @ResponseWrapper(localName = "getGlobalVoiceCascadeOrderResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetGlobalVoiceCascadeOrderResponse")
    public ArrayOfString getGlobalVoiceCascadeOrder();

    /**
     * Receives the labels array in its expected order and returns success code.
     * 
     * @param parametersIn
     * @return
     *     returns com.sendwordnow.schema.users.v2.SimpleResults
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/setGlobalVoiceCascadeOrder")
    @WebResult(name = "setGlobalVoiceCascadeOrderResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", partName = "parametersOut")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public SimpleResults setGlobalVoiceCascadeOrder(
        @WebParam(name = "setGlobalVoiceCascadeOrder", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", partName = "parametersIn")
        SetGlobalVoiceCascadeOrder parametersIn);

    /**
     * Returns true is GlobalCascade is enabled for all messages, false if not.
     * 
     * @param parametersIn
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsGlobalCascadeEnabled", action = "http://www.sendwordnow.com/contract/users/v2/IsGlobalCascadeEnabled")
    @WebResult(name = "isGlobalCascadeEnabledResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", partName = "parametersOut")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public boolean isGlobalCascadeEnabled(
        @WebParam(name = "isGlobalCascadeEnabled", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", partName = "parametersIn")
        IsGlobalCascadeEnabled parametersIn);

    /**
     * Manages the setting of global cascade.
     * 
     * @param parametersIn
     * @return
     *     returns com.sendwordnow.schema.users.v2.SimpleResults
     */
    @WebMethod(operationName = "EnableGlobalCascade", action = "http://www.sendwordnow.com/contract/users/v2/EnableGlobalCascade")
    @WebResult(name = "EnableGlobalCascadeResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", partName = "parametersOut")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public SimpleResults enableGlobalCascade(
        @WebParam(name = "EnableGlobalCascade", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", partName = "parametersIn")
        EnableGlobalCascade parametersIn);

    /**
     * Get list of contact location labels defined in the account.
     * 
     * @return
     *     returns com.sendwordnow.schema.users.v2.ArrayOfContactLocationLabel
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getContactLocationLabels")
    @WebResult(name = "getContactLocationLabelsResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getContactLocationLabels", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactLocationLabels")
    @ResponseWrapper(localName = "getContactLocationLabelsResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactLocationLabelsResponse")
    public ArrayOfContactLocationLabel getContactLocationLabels();

    /**
     * Add secondary contact location label to account. Primary contact location label is created when account is created.
     * 
     * @param label
     * @return
     *     returns com.sendwordnow.schema.users.v2.ObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/createContactLocationLabel")
    @WebResult(name = "createContactLocationLabelResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "createContactLocationLabel", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.CreateContactLocationLabel")
    @ResponseWrapper(localName = "createContactLocationLabelResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.CreateContactLocationLabelResponse")
    public com.sendwordnow.schema.users.v2.ObjActionResult createContactLocationLabel(
        @WebParam(name = "label", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String label);

    /**
     * Rename contact location label. Name must be unique.
     * 
     * @param newLabel
     * @param oldLabel
     * @return
     *     returns com.sendwordnow.schema.users.v2.ObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/renameContactLocationLabel")
    @WebResult(name = "renameContactLocationLabelResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "renameContactLocationLabel", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.RenameContactLocationLabel")
    @ResponseWrapper(localName = "renameContactLocationLabelResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.RenameContactLocationLabelResponse")
    public com.sendwordnow.schema.users.v2.ObjActionResult renameContactLocationLabel(
        @WebParam(name = "oldLabel", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String oldLabel,
        @WebParam(name = "newLabel", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String newLabel);

    /**
     * Delete contact location label. Primary contact location label can't be deleted or labels in use.
     * 
     * @param label
     * @return
     *     returns com.sendwordnow.schema.users.v2.ObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/deleteContactLocationLabel")
    @WebResult(name = "deleteContactLocationLabelResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "deleteContactLocationLabel", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.DeleteContactLocationLabel")
    @ResponseWrapper(localName = "deleteContactLocationLabelResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.DeleteContactLocationLabelResponse")
    public com.sendwordnow.schema.users.v2.ObjActionResult deleteContactLocationLabel(
        @WebParam(name = "label", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        String label);

    /**
     * Returns locations for a list of contacts.
     * 
     * @param contactIdsList
     * @return
     *     returns com.sendwordnow.contract.users.v2.ArrayOfContactLocationsList
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/getContactsLocations")
    @WebResult(name = "getContactsLocationsResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "getContactsLocations", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactsLocations")
    @ResponseWrapper(localName = "getContactsLocationsResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.GetContactsLocationsResponse")
    public ArrayOfContactLocationsList getContactsLocations(
        @WebParam(name = "contactIdsList", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        ContactIdsList contactIdsList);

    /**
     * Method to add, update, and/or remove locations for a list of contacts.
     * 
     * @param locationsInfo
     * @return
     *     returns com.sendwordnow.schema.users.v2.ArrayOfObjActionResult
     */
    @WebMethod(action = "http://www.sendwordnow.com/contract/users/v2/setContactsLocations")
    @WebResult(name = "setContactsLocationsResult", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
    @RequestWrapper(localName = "setContactsLocations", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.SetContactsLocations")
    @ResponseWrapper(localName = "setContactsLocationsResponse", targetNamespace = "http://www.sendwordnow.com/contract/users/v2", className = "com.sendwordnow.contract.users.v2.SetContactsLocationsResponse")
    public com.sendwordnow.schema.users.v2.ArrayOfObjActionResult setContactsLocations(
        @WebParam(name = "locationsInfo", targetNamespace = "http://www.sendwordnow.com/contract/users/v2")
        ArrayOfSetContactLocationsList locationsInfo);

}
