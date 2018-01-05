/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.ValidityPeriod;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class CertificateFields {
  @SerializedName("version")
  private Integer version = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("signatureAlgorithm")
  private String signatureAlgorithm = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("validity")
  private ValidityPeriod validity = null;

  public CertificateFields version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CertificateFields serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * serialNumber
   * @return serialNumber
  **/
  @ApiModelProperty(example = "null", value = "serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public CertificateFields signatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

   /**
   * signatureAlgorithm
   * @return signatureAlgorithm
  **/
  @ApiModelProperty(example = "null", value = "signatureAlgorithm")
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public CertificateFields subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CertificateFields issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * issuer
   * @return issuer
  **/
  @ApiModelProperty(example = "null", value = "issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public CertificateFields validity(ValidityPeriod validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @ApiModelProperty(example = "null", value = "")
  public ValidityPeriod getValidity() {
    return validity;
  }

  public void setValidity(ValidityPeriod validity) {
    this.validity = validity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateFields certificateFields = (CertificateFields) o;
    return Objects.equals(this.version, certificateFields.version) &&
        Objects.equals(this.serialNumber, certificateFields.serialNumber) &&
        Objects.equals(this.signatureAlgorithm, certificateFields.signatureAlgorithm) &&
        Objects.equals(this.subject, certificateFields.subject) &&
        Objects.equals(this.issuer, certificateFields.issuer) &&
        Objects.equals(this.validity, certificateFields.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, serialNumber, signatureAlgorithm, subject, issuer, validity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateFields {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

