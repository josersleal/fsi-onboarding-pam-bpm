package com.redhat.bpms.demo.fsi.onboarding.model;

import com.redhat.bpms.demo.persistence.jpa.marshaller.VariableEntity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Client")
public class Client extends VariableEntity implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CLIENT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "CLIENT_ID_SEQ", name = "CLIENT_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;

   @org.kie.api.definition.type.Label("Country")
   private java.lang.String country;

   @org.kie.api.definition.type.Label("Type")
   private java.lang.String type;

   @org.kie.api.definition.type.Label("Business Identifier Code (BIC) (ISO 9362)")
   private java.lang.String bic;

   @org.kie.api.definition.type.Label("Related Parties")
   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER, orphanRemoval = false)
   private java.util.List<com.redhat.bpms.demo.fsi.onboarding.model.RelatedParty> relatedParties;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label("Address")
   private com.redhat.bpms.demo.fsi.onboarding.model.Address address;

   @org.kie.api.definition.type.Label("Phone Number")
   private java.lang.String phoneNumber;

   @org.kie.api.definition.type.Label(value = "Credit Score")
   private java.lang.Integer creditScore;

   public Client()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getBic()
   {
      return this.bic;
   }

   public void setBic(java.lang.String bic)
   {
      this.bic = bic;
   }

   public java.util.List<com.redhat.bpms.demo.fsi.onboarding.model.RelatedParty> getRelatedParties()
   {
      return this.relatedParties;
   }

   public void setRelatedParties(
         java.util.List<com.redhat.bpms.demo.fsi.onboarding.model.RelatedParty> relatedParties)
   {
      this.relatedParties = relatedParties;
   }

   public com.redhat.bpms.demo.fsi.onboarding.model.Address getAddress()
   {
      return this.address;
   }

   public void setAddress(com.redhat.bpms.demo.fsi.onboarding.model.Address address)
   {
      this.address = address;
   }

   public java.lang.String getPhoneNumber()
   {
      return this.phoneNumber;
   }

   public void setPhoneNumber(java.lang.String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   public java.lang.Integer getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(java.lang.Integer creditScore)
   {
      this.creditScore = creditScore;
   }

   public Client(
         java.lang.Long id,
         java.lang.String name,
         java.lang.String country,
         java.lang.String type,
         java.lang.String bic,
         java.util.List<com.redhat.bpms.demo.fsi.onboarding.model.RelatedParty> relatedParties,
         com.redhat.bpms.demo.fsi.onboarding.model.Address address,
         java.lang.String phoneNumber, java.lang.Integer creditScore)
   {
      this.id = id;
      this.name = name;
      this.country = country;
      this.type = type;
      this.bic = bic;
      this.relatedParties = relatedParties;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.creditScore = creditScore;
   }

}