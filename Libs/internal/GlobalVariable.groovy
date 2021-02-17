package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_URLAmazon
     
    /**
     * <p></p>
     */
    public static Object G_UserAmazon
     
    /**
     * <p></p>
     */
    public static Object G_PassAmazon
     
    /**
     * <p></p>
     */
    public static Object G_URLGoogle
     
    /**
     * <p></p>
     */
    public static Object G_UserGmail
     
    /**
     * <p></p>
     */
    public static Object G_PassGmail
     
    /**
     * <p></p>
     */
    public static Object G_CurrentIndex
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_URLAmazon = selectedVariables['G_URLAmazon']
            G_UserAmazon = selectedVariables['G_UserAmazon']
            G_PassAmazon = selectedVariables['G_PassAmazon']
            G_URLGoogle = selectedVariables['G_URLGoogle']
            G_UserGmail = selectedVariables['G_UserGmail']
            G_PassGmail = selectedVariables['G_PassGmail']
            G_CurrentIndex = selectedVariables['G_CurrentIndex']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
