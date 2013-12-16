package merkurius.ld28.screen;

import merkurius.ld28.EntityFactoryLD28;
import fr.kohen.alexandre.framework.base.GameScreen;
import fr.kohen.alexandre.framework.systems.DefaultActionSystem;
import fr.kohen.alexandre.framework.systems.DefaultBox2DSystem;
import fr.kohen.alexandre.framework.systems.DefaultCameraSystem;
import fr.kohen.alexandre.framework.systems.DefaultDebugSystem;
import fr.kohen.alexandre.framework.systems.DefaultMouseSystem;
import fr.kohen.alexandre.framework.systems.DefaultRenderSystem;
import fr.kohen.alexandre.framework.systems.DefaultScreenSystem;
import fr.kohen.alexandre.framework.systems.DefaultTextSystem;
import fr.kohen.alexandre.framework.systems.DefaultVisualSystem;

public class MenuScreen extends GameScreen {

	@Override
	protected void setSystems() {	
		world.setSystem( new DefaultCameraSystem() );
		world.setSystem( new DefaultRenderSystem() );
		world.setSystem( new DefaultBox2DSystem() );
		world.setSystem( new DefaultScreenSystem(this) );	
		world.setSystem( new DefaultMouseSystem() );	
		world.setSystem( new DefaultActionSystem(EntityFactoryLD28.actions) );
		world.setSystem( new DefaultVisualSystem(EntityFactoryLD28.visuals) );
		world.setSystem( new DefaultTextSystem() );
		world.setSystem( new DefaultDebugSystem() );
	}
	
	@Override
	protected void initialize() {
		EntityFactoryLD28.newServerButton(world, 1, 0, 250).addToWorld();
		EntityFactoryLD28.newServerlistButton(world, 1, 0, -220).addToWorld();
		EntityFactoryLD28.newBackground(world, 1, 0, 0).addToWorld();
		EntityFactoryLD28.newCamera(world, 1, 0, 0, 0, 0, 0, 800, 600, 0, "testCamera").addToWorld();
	}

}
