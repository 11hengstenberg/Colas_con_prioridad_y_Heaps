//import java.io.FileReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		 //CVectorHeap <CPaciente> vector = new CVectorHeap<CPaciente>();
		PriorityQueue<CPaciente> queue = new PriorityQueue<>();
		 Scanner scanner = new Scanner(System.in);
		try {
			
			//readFileAndFillQueue("src/pacientes.txt");
			FileInputStream archivo = new FileInputStream("pacientes.txt");
			DataInputStream entrada = new DataInputStream(archivo);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			String id;
			while ((id = buffer.readLine()) != null) {
				String[] temporal = id.split(", ");
                String nombre = temporal[0];
                String sintoma = temporal[1];
                String prioridad= temporal[2];
                //vector.add(new CPaciente(nombre, sintoma, prioridad));
                queue.add(new CPaciente(nombre, sintoma, prioridad));
            }
			
			entrada.close();
		
		} 
		catch (Exception a) {
			System.err.println("Ha ocurrido un problema" + a.getMessage());
		}
		
		boolean pass = true;
		while(pass) {
			if(!queue.isEmpty()) {
				System.out.println(queue.remove().toString() + "\n");
			}else {
				System.out.println("No Hay Mas Pacientes");
				pass = false;
			}
		}
		scanner.close();
	}
}
