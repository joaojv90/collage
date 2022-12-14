package com.cybertools.college.controller;

import com.cybertools.college.cbdd.CBDD;
import com.cybertools.college.model.ModelTeachers;

import java.sql.*;
import java.util.*;

public class ControllerTeachers implements DAO<ModelTeachers> {

	Statement st = null; 
	PreparedStatement ps = null;

	static Connection conn = CBDD.getConnection();

	@Override
	public List<ModelTeachers> read() {
		List<ModelTeachers> listTeachers = new ArrayList<>();
		try {
			String query = "SELECT * FROM teachers";
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				ModelTeachers mt = new ModelTeachers();
				mt.setNui(rs.getString(1));
				mt.setFirstName(rs.getString(2));
				mt.setLastName(rs.getString(3));
				mt.setMailAddress(rs.getString(4));
				listTeachers.add(mt);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return listTeachers;
	}

	@Override
	public boolean create(ModelTeachers t) {
		try {
			String query = "INSERT INTO teachers (nui, firstName, lastName, mailAddress) VALUES (?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, t.getNui());
			ps.setString(2, t.getFirstName());
			ps.setString(3, t.getLastName());
			ps.setString(4, t.getMailAddress());
			return ps.executeUpdate() != 0;
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return false;
	}

	@Override
	public boolean update(ModelTeachers t) {
		try {
			String query = "UPDATE teachers SET firstName=?, lastName=?, mailAddress=? WHERE nui=?";
			ps = conn.prepareStatement(query);
			ps.setString(4, t.getNui());
			ps.setString(1, t.getFirstName());
			ps.setString(2, t.getLastName());
			ps.setString(3, t.getMailAddress());
			return ps.executeUpdate() != 0;
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return false;
	}

	@Override
	public boolean delete(ModelTeachers t) {
		try {
			String query = "DELETE FROM teachers WHERE nui=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, t.getNui());
			return ps.executeUpdate() != 0;
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return false;
	}

}
