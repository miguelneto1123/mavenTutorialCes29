package Interfaces;

import Engine.Processo;

public interface ServicoEmail {
	public boolean sendEmail (String address, Processo proc, boolean status);
}
