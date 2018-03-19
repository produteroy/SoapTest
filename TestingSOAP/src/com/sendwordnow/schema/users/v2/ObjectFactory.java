
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sendwordnow.schema.users.v2 package. 
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

    private final static QName _GetContactDetailResult_QNAME = new QName("http://www.sendwordnow.com/schema/users/v2", "getContactDetailResult");
    private final static QName _ContactDetail_QNAME = new QName("http://www.sendwordnow.com/schema/users/v2", "ContactDetail");
    private final static QName _GrpCreateReq_QNAME = new QName("http://www.sendwordnow.com/schema/users/v2", "GrpCreateReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sendwordnow.schema.users.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactLocationsList }
     * 
     */
    public ContactLocationsList createContactLocationsList() {
        return new ContactLocationsList();
    }

    /**
     * Create an instance of {@link ObjActionResult }
     * 
     */
    public ObjActionResult createObjActionResult() {
        return new ObjActionResult();
    }

    /**
     * Create an instance of {@link ContactDetail }
     * 
     */
    public ContactDetail createContactDetail() {
        return new ContactDetail();
    }

    /**
     * Create an instance of {@link GrpCreateReq }
     * 
     */
    public GrpCreateReq createGrpCreateReq() {
        return new GrpCreateReq();
    }

    /**
     * Create an instance of {@link ArrayOfContactLocationLabel }
     * 
     */
    public ArrayOfContactLocationLabel createArrayOfContactLocationLabel() {
        return new ArrayOfContactLocationLabel();
    }

    /**
     * Create an instance of {@link ArrayOfObjActionResult }
     * 
     */
    public ArrayOfObjActionResult createArrayOfObjActionResult() {
        return new ArrayOfObjActionResult();
    }

    /**
     * Create an instance of {@link ContactDetailContactPointsListEmailTextMsgContactPnt }
     * 
     */
    public ContactDetailContactPointsListEmailTextMsgContactPnt createContactDetailContactPointsListEmailTextMsgContactPnt() {
        return new ContactDetailContactPointsListEmailTextMsgContactPnt();
    }

    /**
     * Create an instance of {@link SetContactLocationsList }
     * 
     */
    public SetContactLocationsList createSetContactLocationsList() {
        return new SetContactLocationsList();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLabels }
     * 
     */
    public ArrayOfLocationLabels createArrayOfLocationLabels() {
        return new ArrayOfLocationLabels();
    }

    /**
     * Create an instance of {@link ArrayOfContactCustomField }
     * 
     */
    public ArrayOfContactCustomField createArrayOfContactCustomField() {
        return new ArrayOfContactCustomField();
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
     * Create an instance of {@link ArrayOfContactIds }
     * 
     */
    public ArrayOfContactIds createArrayOfContactIds() {
        return new ArrayOfContactIds();
    }

    /**
     * Create an instance of {@link ContactPntEmailType }
     * 
     */
    public ContactPntEmailType createContactPntEmailType() {
        return new ContactPntEmailType();
    }

    /**
     * Create an instance of {@link ContactCustomField }
     * 
     */
    public ContactCustomField createContactCustomField() {
        return new ContactCustomField();
    }

    /**
     * Create an instance of {@link StreetAddressContactLocation }
     * 
     */
    public StreetAddressContactLocation createStreetAddressContactLocation() {
        return new StreetAddressContactLocation();
    }

    /**
     * Create an instance of {@link ArrayOfContactLocation }
     * 
     */
    public ArrayOfContactLocation createArrayOfContactLocation() {
        return new ArrayOfContactLocation();
    }

    /**
     * Create an instance of {@link ContactLocationLabel }
     * 
     */
    public ContactLocationLabel createContactLocationLabel() {
        return new ContactLocationLabel();
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
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link ContactCustomFieldDefinition }
     * 
     */
    public ContactCustomFieldDefinition createContactCustomFieldDefinition() {
        return new ContactCustomFieldDefinition();
    }

    /**
     * Create an instance of {@link ContactLocationsList.Locations }
     * 
     */
    public ContactLocationsList.Locations createContactLocationsListLocations() {
        return new ContactLocationsList.Locations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com/schema/users/v2", name = "getContactDetailResult")
    public JAXBElement<ContactDetail> createGetContactDetailResult(ContactDetail value) {
        return new JAXBElement<ContactDetail>(_GetContactDetailResult_QNAME, ContactDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com/schema/users/v2", name = "ContactDetail")
    public JAXBElement<ContactDetail> createContactDetail(ContactDetail value) {
        return new JAXBElement<ContactDetail>(_ContactDetail_QNAME, ContactDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrpCreateReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sendwordnow.com/schema/users/v2", name = "GrpCreateReq")
    public JAXBElement<GrpCreateReq> createGrpCreateReq(GrpCreateReq value) {
        return new JAXBElement<GrpCreateReq>(_GrpCreateReq_QNAME, GrpCreateReq.class, null, value);
    }

}
