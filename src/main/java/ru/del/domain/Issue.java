package ru.del.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Issue {

    private Integer id;
    private LinkData project;
    private LinkData tracker;
    private LinkData status;
    private LinkData priority;
    private LinkData author;
    @JsonProperty("assigned_to")
    private LinkData assignedTo;
    private String subject;
    private String description;
    @JsonProperty("start_date")
    private LocalDate startDate;
    @JsonProperty("due_date")
    private LocalDate dueDate;
    @JsonProperty("done_ratio")
    private Integer doneRatio;
    @JsonProperty("is_private")
    private Boolean isPrivate;
    @JsonProperty("estimated_hours")
    private Integer estimatedHours;
    @JsonProperty("totalEstimatedHours")
    private Integer total_estimated_hours;
    @JsonProperty("spent_hours")
    private Integer spentHours;
    @JsonProperty("total_spent_hours")
    private Integer totalSpentHours;
    @JsonProperty("created_on")
    private LocalDateTime createdTime;
    @JsonProperty("updated_on")
    private LocalDateTime updatedTime;
    @JsonProperty("closed_on")
    private LocalDateTime closedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LinkData getProject() {
        return project;
    }

    public void setProject(LinkData project) {
        this.project = project;
    }

    public LinkData getTracker() {
        return tracker;
    }

    public void setTracker(LinkData tracker) {
        this.tracker = tracker;
    }

    public LinkData getStatus() {
        return status;
    }

    public void setStatus(LinkData status) {
        this.status = status;
    }

    public LinkData getPriority() {
        return priority;
    }

    public void setPriority(LinkData priority) {
        this.priority = priority;
    }

    public LinkData getAuthor() {
        return author;
    }

    public void setAuthor(LinkData author) {
        this.author = author;
    }

    public LinkData getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(LinkData assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getDoneRatio() {
        return doneRatio;
    }

    public void setDoneRatio(Integer doneRatio) {
        this.doneRatio = doneRatio;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Integer getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Integer estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public Integer getTotal_estimated_hours() {
        return total_estimated_hours;
    }

    public void setTotal_estimated_hours(Integer total_estimated_hours) {
        this.total_estimated_hours = total_estimated_hours;
    }

    public Integer getSpentHours() {
        return spentHours;
    }

    public void setSpentHours(Integer spentHours) {
        this.spentHours = spentHours;
    }

    public Integer getTotalSpentHours() {
        return totalSpentHours;
    }

    public void setTotalSpentHours(Integer totalSpentHours) {
        this.totalSpentHours = totalSpentHours;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public LocalDateTime getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(LocalDateTime closedTime) {
        this.closedTime = closedTime;
    }
}
