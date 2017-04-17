package Interfaces;

import Engine.Processo;

public interface RepositorioProcessos {
	public boolean addProcesso (Processo proc);
	public Processo getProcesso (int id);
}
