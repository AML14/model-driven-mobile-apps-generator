package workflow;

import java.io.File;

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
		/*
		ProcessBuilder pb = new ProcessBuilder("/ruta/al/script.sh");
		pb.directory(new File("/ruta/al/working/directory"));
		Process p = pb.start();
		*/
	}

	@Override public void setContainer(CompositeComponent arg0) {  }

	@Override public void setLocation(Location arg0) { }

}
