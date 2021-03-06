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
import cloud.artik.model.TaskParameters;
import cloud.artik.model.TaskStatusCounts;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class Task {
  @SerializedName("filter")
  private String filter = null;

  @SerializedName("taskType")
  private String taskType = null;

  @SerializedName("modifiedOn")
  private Long modifiedOn = null;

  @SerializedName("dtid")
  private String dtid = null;

  @SerializedName("statusCounts")
  private TaskStatusCounts statusCounts = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("dids")
  private List<String> dids = new ArrayList<String>();

  @SerializedName("taskParameters")
  private TaskParameters taskParameters = null;

  @SerializedName("createdOn")
  private Long createdOn = null;

  @SerializedName("status")
  private String status = null;

  public Task filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "Filter")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public Task taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Task type
   * @return taskType
  **/
  @ApiModelProperty(example = "null", value = "Task type")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public Task modifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Modified on
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "Modified on")
  public Long getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Task dtid(String dtid) {
    this.dtid = dtid;
    return this;
  }

   /**
   * Device Type ID
   * @return dtid
  **/
  @ApiModelProperty(example = "null", value = "Device Type ID")
  public String getDtid() {
    return dtid;
  }

  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  public Task statusCounts(TaskStatusCounts statusCounts) {
    this.statusCounts = statusCounts;
    return this;
  }

   /**
   * Status counts
   * @return statusCounts
  **/
  @ApiModelProperty(example = "null", value = "Status counts")
  public TaskStatusCounts getStatusCounts() {
    return statusCounts;
  }

  public void setStatusCounts(TaskStatusCounts statusCounts) {
    this.statusCounts = statusCounts;
  }

  public Task property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Property
   * @return property
  **/
  @ApiModelProperty(example = "null", value = "Property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public Task id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Task ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Task ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Task dids(List<String> dids) {
    this.dids = dids;
    return this;
  }

  public Task addDidsItem(String didsItem) {
    this.dids.add(didsItem);
    return this;
  }

   /**
   * Device IDs
   * @return dids
  **/
  @ApiModelProperty(example = "null", value = "Device IDs")
  public List<String> getDids() {
    return dids;
  }

  public void setDids(List<String> dids) {
    this.dids = dids;
  }

  public Task taskParameters(TaskParameters taskParameters) {
    this.taskParameters = taskParameters;
    return this;
  }

   /**
   * Task parameters
   * @return taskParameters
  **/
  @ApiModelProperty(example = "null", value = "Task parameters")
  public TaskParameters getTaskParameters() {
    return taskParameters;
  }

  public void setTaskParameters(TaskParameters taskParameters) {
    this.taskParameters = taskParameters;
  }

  public Task createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Created on
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "Created on")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public Task status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.filter, task.filter) &&
        Objects.equals(this.taskType, task.taskType) &&
        Objects.equals(this.modifiedOn, task.modifiedOn) &&
        Objects.equals(this.dtid, task.dtid) &&
        Objects.equals(this.statusCounts, task.statusCounts) &&
        Objects.equals(this.property, task.property) &&
        Objects.equals(this.id, task.id) &&
        Objects.equals(this.dids, task.dids) &&
        Objects.equals(this.taskParameters, task.taskParameters) &&
        Objects.equals(this.createdOn, task.createdOn) &&
        Objects.equals(this.status, task.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, taskType, modifiedOn, dtid, statusCounts, property, id, dids, taskParameters, createdOn, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    statusCounts: ").append(toIndentedString(statusCounts)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dids: ").append(toIndentedString(dids)).append("\n");
    sb.append("    taskParameters: ").append(toIndentedString(taskParameters)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

