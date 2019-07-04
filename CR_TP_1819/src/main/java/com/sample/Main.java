package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class Main {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	//criar uma instancia com parametro do kSession
        	FrameInsercaoDados J1 = new FrameInsercaoDados(kSession);
        	GUI J2 = new GUI(kSession);
<<<<<<< HEAD
=======
        	
>>>>>>> branch 'master' of https://github.com/Kelve17/CR_TP_1819.git
            // go !

            //kSession.insert();
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

