package HwArray;

public class array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = { "Natalia", "Igor", "Natalia", "Oleg", "Oleg", "Alexia", "Igor"};
		String[] duplName = new String[names.length];
				int index = 1;
				int indDupl = 0;
				for (String name : names) {
					for (int i = index; i < names.length; i++) {
												
						if (name.equals(names[i])) {
							for (int d = 0; d <= indDupl; d++) {
																
								if (name.equals(duplName[d])) {
									break;
								} else {
									duplName[indDupl] = name;
			indDupl++;
								break;
								}
							}
						}
					}
					index++;
				}
				for (int c = 0; c < indDupl; c++) {
					System.out.println(duplName[c]);
				}
	}

}
