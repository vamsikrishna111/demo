package com.sairam.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userdetails")
public class Form {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		private String Name;
		private String Email;
		private String passport_number;
		private String gender;
		private String country_of_nationality;
		private String type_of_visa_application;
		private long total_fee;
		private String contact_language;
		private String payment_reference;
		private String relational_status;
		private String another_email;
		private String date_of_birth;		
		private String duration_of_visa;
		private String date_of_departure;
		private String date_of_arrival;
		private String issue_date;
		private String expiry_date;
		
		
		
		
		
		public String getPassport_number() {
			return passport_number;
		}
		public void setPassport_number(String passport_number) {
			this.passport_number = passport_number;
		}
		public String getCountry_of_nationality() {
			return country_of_nationality;
		}
		public void setCountry_of_nationality(String country_of_nationality) {
			this.country_of_nationality = country_of_nationality;
		}
		public String getType_of_visa_application() {
			return type_of_visa_application;
		}
		public void setType_of_visa_application(String type_of_visa_application) {
			this.type_of_visa_application = type_of_visa_application;
		}
		public long getTotal_fee() {
			return total_fee;
		}
		public void setTotal_fee(long total_fee) {
			this.total_fee = total_fee;
		}
		public String getContact_language() {
			return contact_language;
		}
		public void setContact_language(String contact_language) {
			this.contact_language = contact_language;
		}
		public String getPayment_reference() {
			return payment_reference;
		}
		public void setPayment_reference(String payment_reference) {
			this.payment_reference = payment_reference;
		}
		public String getRelational_status() {
			return relational_status;
		}
		public void setRelational_status(String relational_status) {
			this.relational_status = relational_status;
		}
		public String getAnother_email() {
			return another_email;
		}
		public void setAnother_email(String another_email) {
			this.another_email = another_email;
		}
		public String getDate_of_birth() {
			return date_of_birth;
		}
		public void setDate_of_birth(String date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public String getDuration_of_visa() {
			return duration_of_visa;
		}
		public void setDuration_of_visa(String duration_of_visa) {
			this.duration_of_visa = duration_of_visa;
		}
		public String getDate_of_departure() {
			return date_of_departure;
		}
		public void setDate_of_departure(String date_of_departure) {
			this.date_of_departure = date_of_departure;
		}
		public String getDate_of_arrival() {
			return date_of_arrival;
		}
		public void setDate_of_arrival(String date_of_arrival) {
			this.date_of_arrival = date_of_arrival;
		}
		public String getIssue_date() {
			return issue_date;
		}
		public void setIssue_date(String issue_date) {
			this.issue_date = issue_date;
		}
		public String getExpiry_date() {
			return expiry_date;
		}
		public void setExpiry_date(String expiry_date) {
			this.expiry_date = expiry_date;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}		
			
}
