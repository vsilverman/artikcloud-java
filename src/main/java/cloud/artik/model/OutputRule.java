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
import cloud.artik.model.RuleError;
import cloud.artik.model.RuleWarningOutput;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Rule information.
 */
@ApiModel(description = "Rule information.")

public class OutputRule {
  @SerializedName("aid")
  private String aid = null;

  @SerializedName("createdOn")
  private Long createdOn = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("error")
  private RuleError error = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("invalidatedOn")
  private Long invalidatedOn = null;

  @SerializedName("languageVersion")
  private Integer languageVersion = null;

  @SerializedName("modifiedOn")
  private Long modifiedOn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rule")
  private Map<String, Object> rule = new HashMap<String, Object>();

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("warning")
  private RuleWarningOutput warning = null;

  /**
   * Gets or Sets owner
   */
  public enum OwnerEnum {
    @SerializedName("user")
    USER("user"),
    
    @SerializedName("application")
    APPLICATION("application");

    private String value;

    OwnerEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("owner")
  private OwnerEnum owner = null;

  public OutputRule aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }

  public OutputRule createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public OutputRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OutputRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OutputRule error(RuleError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuleError getError() {
    return error;
  }

  public void setError(RuleError error) {
    this.error = error;
  }

  public OutputRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OutputRule index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public OutputRule invalidatedOn(Long invalidatedOn) {
    this.invalidatedOn = invalidatedOn;
    return this;
  }

   /**
   * Get invalidatedOn
   * @return invalidatedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getInvalidatedOn() {
    return invalidatedOn;
  }

  public void setInvalidatedOn(Long invalidatedOn) {
    this.invalidatedOn = invalidatedOn;
  }

  public OutputRule languageVersion(Integer languageVersion) {
    this.languageVersion = languageVersion;
    return this;
  }

   /**
   * Get languageVersion
   * @return languageVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLanguageVersion() {
    return languageVersion;
  }

  public void setLanguageVersion(Integer languageVersion) {
    this.languageVersion = languageVersion;
  }

  public OutputRule modifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public OutputRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutputRule rule(Map<String, Object> rule) {
    this.rule = rule;
    return this;
  }

  public OutputRule putRuleItem(String key, Object ruleItem) {
    this.rule.put(key, ruleItem);
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getRule() {
    return rule;
  }

  public void setRule(Map<String, Object> rule) {
    this.rule = rule;
  }

  public OutputRule uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OutputRule warning(RuleWarningOutput warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuleWarningOutput getWarning() {
    return warning;
  }

  public void setWarning(RuleWarningOutput warning) {
    this.warning = warning;
  }

  public OutputRule owner(OwnerEnum owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public OwnerEnum getOwner() {
    return owner;
  }

  public void setOwner(OwnerEnum owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputRule outputRule = (OutputRule) o;
    return Objects.equals(this.aid, outputRule.aid) &&
        Objects.equals(this.createdOn, outputRule.createdOn) &&
        Objects.equals(this.description, outputRule.description) &&
        Objects.equals(this.enabled, outputRule.enabled) &&
        Objects.equals(this.error, outputRule.error) &&
        Objects.equals(this.id, outputRule.id) &&
        Objects.equals(this.index, outputRule.index) &&
        Objects.equals(this.invalidatedOn, outputRule.invalidatedOn) &&
        Objects.equals(this.languageVersion, outputRule.languageVersion) &&
        Objects.equals(this.modifiedOn, outputRule.modifiedOn) &&
        Objects.equals(this.name, outputRule.name) &&
        Objects.equals(this.rule, outputRule.rule) &&
        Objects.equals(this.uid, outputRule.uid) &&
        Objects.equals(this.warning, outputRule.warning) &&
        Objects.equals(this.owner, outputRule.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, createdOn, description, enabled, error, id, index, invalidatedOn, languageVersion, modifiedOn, name, rule, uid, warning, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputRule {\n");
    
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    invalidatedOn: ").append(toIndentedString(invalidatedOn)).append("\n");
    sb.append("    languageVersion: ").append(toIndentedString(languageVersion)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

