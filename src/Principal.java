
public class Principal {

	
	//hhejcjw
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Guardar
		//coleccion de objetos
		
		Autos auto1 = new Autos(23344, "NISSAN", "N45", 450000f);
		Autos auto2 = new Autos(6789, "Toyota", "bk89", 7890f);
		Autos auto3 = new Autos(9986, "Kia", "uujk", 0064f);
		
		
		//instancia de clase---ya se tiene acceso a todo lo que contenga esta clase
		LogicaMetodos imp=new LogicaMetodos();
		
		
		//Guardar
		
		imp.guardar(auto1);
		imp.guardar(auto2);
		imp.guardar(auto3);
		
		//Mostrar
		System.out.println(imp.mostrar());
		
		
		//Buscar
		Autos autoEn =imp.buscar(1);
		System.out.println("Se encontro"+autoEn); 
		
		
		//Editar---modelo
		autoEn.setModelo("corolla");
		imp.editar(1, autoEn);
		
		//Mostrar
		System.out.println(imp.mostrar());
		
		
		//Eliminar
		imp.eliminar(0);
		
		//Mostrar
		System.out.println(imp.mostrar());
		System.out.println(imp.tamanoLista());
		
		//
	}
	

}
