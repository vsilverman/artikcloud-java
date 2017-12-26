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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class DeviceTypeUpdateInput {
  @SerializedName("enableWhitelist")
  private Boolean enableWhitelist = null;

  public DeviceTypeUpdateInput enableWhitelist(Boolean enableWhitelist) {
    this.enableWhitelist = enableWhitelist;
    return this;
  }

   /**
   * enable whitelist flag
   * @return enableWhitelist
  **/
  @ApiModelProperty(example = "null", value = "enable whitelist flag")
  public Boolean getEnableWhitelist() {
    return enableWhitelist;
  }

  public void setEnableWhitelist(Boolean enableWhitelist) {
    this.enableWhitelist = enableWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTypeUpdateInput deviceTypeUpdateInput = (DeviceTypeUpdateInput) o;
    return Objects.equals(this.enableWhitelist, deviceTypeUpdateInput.enableWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableWhitelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypeUpdateInput {\n");
    
    sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
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
