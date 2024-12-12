package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Model_Food;

public class Data_Food {
	private Connection conn;
	private Data_Food instance;
	private ConnectDatabase cn;
	
	public Data_Food getInstance() {
		if(instance == null) {
			instance = new Data_Food();
		}
		return instance;
	}
	
	public Data_Food() {
        this.conn = cn.getConnection();
	}
	
	public ArrayList<Model_Food> loadFood() {
		ArrayList<Model_Food> list = new ArrayList<>();
		try {
			conn = cn.getConnection();
			
			String sql = "SELECT * FROM FOOD";
			PreparedStatement st = conn.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String food_id = rs.getString(1);
				String food_name = rs.getString(2);
				String food_type = rs.getString(3);
				int food_price = rs.getInt(4);
				String food_image = rs.getString(5);
				
				Model_Food food = new Model_Food(food_id, food_name, food_type, food_price, food_image);
				
				list.add(food);
			}
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean addFood(Model_Food food) {
		int result = 0;
		try {
			conn = cn.getConnection();
			
			String sql = "INSERT INTO FOOD (Food_Id, Food_Name, Food_Type, Food_Price, Food_Image) "
					+ "VALUES (?,?,?,?,?)";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, food.getFood_id());
			st.setString(2, food.getFood_name());
			st.setString(3, food.getFood_type());
			st.setInt(4, food.getFood_price());
			st.setString(5, food.getFood_image());
			
			result = st.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Thêm Món Ăn Thành Công!");
			
			conn.close();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Thêm Món Ăn Thất Bại, Vui Lòng Nhập Lại!");
			e.printStackTrace();
		}
		return result > 0;
	}
	
	public Model_Food selectFood(String id) {
		Model_Food food = null;
		try {
			conn = cn.getConnection();
			
			String sql = "SELECT * FROM Food_Id";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String food_id = rs.getString(1);
				String food_name = rs.getString(2);
				String food_type = rs.getString(3);
				int food_price = rs.getInt(4);
				String food_image = rs.getString(5);
				
				food = new Model_Food(food_id, food_name, food_type, food_price, food_image);
			}
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return food;
	}
	
	public boolean updateFood(Model_Food food) {
		int result = 0;
		try {
			conn = cn.getConnection();
			
			String sql = "UPDATE FOOD "
					+ "SET Food_Id=?, Food_Name=?, Food_Type=?, Food_Price=?, Food_Image=? "
					+ "WHERE Food_Id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, food.getFood_id());
			st.setString(2, food.getFood_name());
			st.setString(3, food.getFood_type());
			st.setInt(4, food.getFood_price());
			st.setString(5, food.getFood_image());
			
			result = st.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Cập nhật sinh viên thành công!");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cập nhật sinh viên thất bại, vui lòng nhập lại!");
		}
		return result > 0;
	}
	
	public boolean deleteFood(String id) {
		int result = 0;
		try {
			conn = cn.getConnection();
			
			String sql = "DELETE FROM FOOD "
					+ "WHERE Food_Id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, id);
			
			result = st.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Xóa món ăn thành công!");
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Xóa món ăn thất bại!");
		}
		return result > 0;
	}
}
