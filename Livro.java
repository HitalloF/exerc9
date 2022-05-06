public class Livro {
    private boolean Emprestimo;

    public Livro(boolean emprestimo) {
        Emprestimo = emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        Emprestimo = emprestimo;
    }

    public boolean isEmprestimo() {
        return Emprestimo;
    }
}
