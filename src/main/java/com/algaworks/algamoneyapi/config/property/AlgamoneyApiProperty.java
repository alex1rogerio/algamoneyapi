/**
 * 
 */
package com.algaworks.algamoneyapi.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Usuario
 *
 */

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProperty {
	
	private String origemPermitida = "http://localhost:8000";  
	
	public final Seguranca seguranca = new Seguranca();	
	
	public Seguranca getSeguranca() {
		return seguranca;
	}
	
	public static class Seguranca{
		
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
		
	}

	public String getOrigemPermitida() {
		return origemPermitida;
	}

	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}

	
	
}
