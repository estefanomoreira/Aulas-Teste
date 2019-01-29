import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File diretorio = new File("../Aulas-Teste/src/br/com/maratona/javacore/Vio/test/folder");
		boolean mkdir = diretorio.mkdir();
		System.out.println("Diretorio Criado: " + mkdir);
		try {
			for (int i = 0; i <= 5; i++) {
				File arquivo = new File(diretorio, "arquivo" + i + ".txt");
				boolean newFile;
				newFile = arquivo.createNewFile();
				System.out.println("Arquivo " + i + " criado: " + newFile);
				File arquivoNovoNome = new File(diretorio, "arquivo_renomeado" + i + 	".txt");
				boolean renamed = arquivo.renameTo(arquivoNovoNome);
				System.out.println("renomeado: " + renamed);
			}
		File diretorioRenomeado = new File("../Aulas-Teste/src/br/com/maratona/javacore/Vio/test/folder2");
		boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
		System.out.println(diretorioRenamed);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buscarArquivos();
	}
	
	public static void buscarArquivos() {
		File file = new File("../Aulas-Teste/src/br/com/maratona/javacore/Vio/test/folder2");
		String[] list = file.list();
		for(String arquivo : list) {
			System.out.println(arquivo);
		}
		
	}

}
