package com.example.atividade4;

public class Atividade4Application {
    public static String encryptThis(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }

        // Divide o texto em palavras usando o padrão \b (início de palavra)
        String[] palavras = texto.split("\\b");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                if (Character.isLetter(palavra.charAt(0))) { // Verifica se o primeiro caractere é uma letra
                    resultado.append((int) palavra.charAt(0)); // Converte o primeiro caractere em seu código ASCII
                    if (palavra.length() > 1) {
                        resultado.append(palavra.charAt(palavra.length() - 1)); // Adiciona o último caractere
                        if (palavra.length() > 2) {
                            resultado.append(palavra, 2, palavra.length() - 1); // Adiciona o conteúdo do meio da palavra
                            resultado.append(palavra.charAt(1)); // Adiciona o segundo caractere
                        }
                    }
                } else { // Se não for uma letra, adiciona o elemento sem alteração
                    resultado.append(palavra);
                }
            }
        }

        return resultado.toString();
    }
}
