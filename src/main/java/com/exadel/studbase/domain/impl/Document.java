package com.exadel.studbase.domain.impl;

import com.exadel.studbase.domain.IEntity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "\"DOCUMENT\"")
public class Document implements IEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "doctype")
    private String doctype;

    @Column(name = "issue_date")
    private Date issueDate;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "info")
    private String info;

    public Document() {
    }

    public Document(String doctype, Date issueDate, Date expirationDate, String info, Long studentId) {
        this.id = null;
        this.doctype = doctype;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.info = info;
        this.studentId = studentId;
    }

    public Document(Long studentId, String doctype, Date issueDate, String info) {
        this.id = null;
        this.studentId = studentId;
        this.doctype = doctype;
        this.issueDate = issueDate;
        this.expirationDate = null;
        this.info = info;
    }

    public Document(Long studentId, String doctype, Date issueDate) {
        this.id = null;
        this.studentId = studentId;
        this.doctype = doctype;
        this.issueDate = issueDate;
        this.expirationDate = null;
        this.info = null;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setUser(Long id) {
        this.studentId = id;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (!id.equals(document.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", doctype='" + doctype + '\'' +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                ", info='" + info + '\'' +
                '}';
    }
}
