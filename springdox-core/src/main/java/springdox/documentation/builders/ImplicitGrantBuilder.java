package springdox.documentation.builders;

import springdox.documentation.service.ImplicitGrant;
import springdox.documentation.service.LoginEndpoint;

public class ImplicitGrantBuilder {
  private LoginEndpoint loginEndpoint;
  private String tokenName;

  public ImplicitGrantBuilder loginEndpoint(LoginEndpoint loginEndpoint) {
    this.loginEndpoint = BuilderDefaults.defaultIfAbsent(loginEndpoint, this.loginEndpoint);
    return this;
  }

  public ImplicitGrantBuilder tokenName(String tokenName) {
    this.tokenName = BuilderDefaults.defaultIfAbsent(tokenName, this.tokenName);
    return this;
  }

  public ImplicitGrant build() {
    return new ImplicitGrant(loginEndpoint, tokenName);
  }
}