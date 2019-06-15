import com.google.inject.AbstractModule;

import com.google.inject.name.Names;
import services.*;
/**
 * This class is a Guice module that tells Guice how to bind several
 * different types. This Guice module is created when the Play
 * application starts.
 *
 * Play will automatically use any class called `Module` that is in
 * the root package. You can create modules in other locations by
 * adding `play.modules.enabled` settings to the `application.conf`
 * configuration file.
 */
public class Module extends AbstractModule {

    @Override
    public void configure() {
        bind(AppStateService.class).annotatedWith(Names.named("AppState"))
                .to(AppStateService.class).asEagerSingleton();

        // Set implementations to be used
        bind(AuthenticationService.class).to(AuthenticationServer.class);
        // bind(QRCodeService.class).to();
        bind(ExecutionService.class).to(InterpreterService.class);
        // bind(AutocompleteManager.class).to();
    }

}
