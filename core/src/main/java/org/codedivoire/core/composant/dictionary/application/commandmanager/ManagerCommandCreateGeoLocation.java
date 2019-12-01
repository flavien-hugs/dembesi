package org.codedivoire.core.composant.dictionary.application.commandmanager;

import org.codedivoire.core.composant.dictionary.application.command.geolocation.CreateGeoLocationCommand;
import org.codedivoire.core.composant.dictionary.application.port.RepositoryGeoLocalisationPort;
import org.codedivoire.core.composant.dictionary.application.port.RepositoryNamePort;
import org.codedivoire.core.composant.dictionary.application.usecase.geolocation.CreateGeoLocation;
import org.codedivoire.core.composant.dictionary.domain.entity.GeoLocation;
import org.codedivoire.core.kernelshared.CommandManager;

/**
 * Manager for the command to create a {@link GeoLocation}
 *
 * @author Christian Amani 2019-12-01
 */
public class ManagerCommandCreateGeoLocation implements CommandManager<CreateGeoLocationCommand> {

  private final CreateGeoLocation createGeoLocation;

  public ManagerCommandCreateGeoLocation(
      RepositoryNamePort repositoryName,
      RepositoryGeoLocalisationPort repositoryGeoLocation) {
    createGeoLocation = new CreateGeoLocation(repositoryName, repositoryGeoLocation);
  }

  @Override
  public void executed(CreateGeoLocationCommand command) {
    createGeoLocation.create(command);
  }
}
