package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("O texto deve conter pelo menos 1 caracter.");
        }
		String criptografada = "";
        for(int i=0;i<texto.length();i++){
            if (((texto.charAt(i) >= 'A') && (texto.charAt(i) <= 'Z')) ||
                    ((texto.charAt(i) >= 'a') && (texto.charAt(i) <= 'z'))) {
                criptografada = criptografada + (char)(texto.charAt(i) + 3);
            }else{
                criptografada = criptografada + (texto.charAt(i));
            }
        }
        return criptografada.toLowerCase();
    }

    @Override
    public String descriptografar(String texto) {
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("O texto deve conter pelo menos 1 caracter.");
        }
		String descriptografada = "";
        for(int i=0;i<texto.length();i++){
            if (((texto.charAt(i) >= 'A') && (texto.charAt(i) <= 'Z')) ||
                    ((texto.charAt(i) >= 'a') && (texto.charAt(i) <= 'z'))) {
                descriptografada = descriptografada + (char)(texto.charAt(i) - 3);
            }else{
                descriptografada = descriptografada + (texto.charAt(i));
            }
        }
        return descriptografada.toLowerCase();
    }
}
