package workflow;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

@SuppressWarnings("restriction")
public class RNHelper implements WorkflowComponent {

	@Override public void checkConfiguration(Issues arg0) { }

	@Override public String getComponentName() { return "React Native Helper component"; }

	@Override public CompositeComponent getContainer() { return null; }

	@Override public Location getLocation() { return null; }

	@Override
	// Código para copiar los elementos generados y compilarlos
	public void invoke(WorkflowContext wc, ProgressMonitor pm, Issues issues) {
		
		ProcessBuilder pb = new ProcessBuilder("/Users/Alberto/workspace/Eclipse-Epsilon/model-driven-mobile-apps-generator/src/workflow/runRN.sh").inheritIO();
		pb.directory(new File("/Users/Alberto/workspace/Eclipse-Epsilon/model-driven-mobile-apps-generator/src/workflow"));
		try {
			Process p = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override public void setContainer(CompositeComponent arg0) {  }

	@Override public void setLocation(Location arg0) { }

}
