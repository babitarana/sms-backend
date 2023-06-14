package com.sms.student.attendance;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.sms.student.student.Student;

import lombok.Data;

@Data
@Entity
@Table
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private int studentId;
	    private Date date;
	    private boolean present;
	    
	    @ManyToOne
	    private Student student;
}
