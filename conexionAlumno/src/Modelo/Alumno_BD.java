package Modelo;

import Modelo.Alumno;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class Alumno_BD {

    public static void guardarAlumnoBD(Alumno alumno) {
        /* try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiante", "root", "root");
            System.out.print("Conexion establecida!");

            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiante values('" + alumno.getCedula()
                    + "','" + alumno.getNombre() + "','" + alumno.getApellido() + "','" + alumno.getCarrera() + "','"
                    + alumno.getModulo()
                    + "','" + alumno.getTeléfono() + "')");
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }

    public static void eliminar(String cedula) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiante", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from estudiante where cedula = '" + cedula + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
//	public static ArrayList cargar(){
//			try{
//				Class.forName("com.mysql.jdbc.Driver");
//				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sorteoestudiantes","root","");
//				System.out.print("Conexion establecida!");
//				Statement sentencia = conexion.createStatement();
//				ResultSet necesario = sentencia.executeQuery("select * from estudiante");
//                                Estudiante estudiante;
//				 listaE = new ArrayList<>();
//				while(necesario.next()){
//					String ced= necesario.getString("cedula");
//                                        String nom = necesario.getString("nombres");
//					String ape = necesario.getString("apellidos");
//                                        String car = necesario.getString("carrera");
//                                        String mod = necesario.getString("modulo");
//					String tel = necesario.getString("telefono");
//					estudiante=new Estudiante();
//                                        estudiante.setCedula(ced);
//					estudiante.setNombres(nom);
//					estudiante.setApellidos(ape);
//					estudiante.setCarrera(car);
//                                        estudiante.setModulo(mod);
//                                        estudiante.setTelefono(tel);
//					
//					listaE.add(estudiante);
//				}
//				sentencia.close();
//				conexion.close();
//				
//			}catch(Exception ex){
//				System.out.print("Error en la conexion"+ex);
//			}
//			return listaE;
//			
//		}
//		
//		public static Object buscar(String cedula){
//			ListasEstudiantesBD r = new ListasEstudiantesBD();
//			listaE=new ArrayList<>();
//			listaE = r.cargar();	
//			for(int i = 0;i<listaE.size();i++){
//				Estudiante con = (Estudiante)listaE.get(i);
//				if(con.getCedula().equals(cedula)){
//					return con;
//				}
//			}
//			return null;
//		}*/
    }
}
