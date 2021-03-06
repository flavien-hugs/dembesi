package org.codedivoire.core.composant.usermanagement.domaine.exception;

/**
 * Exception qui se déclence lorsqu'un login est déjà utilisé
 *
 * @author Christian Amani 2019-11-24
 */
public class LoginAlreadyUsed extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LoginAlreadyUsed() {
    }
}
