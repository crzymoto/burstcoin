package brs.http;

import brs.BurstException;
import brs.http.common.Parameters;
import brs.services.ParameterService;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;

public final class GetBalance extends APIServlet.APIRequestHandler {

  private final ParameterService parameterService;

  public GetBalance(ParameterService parameterService) {
    super(new APITag[]{APITag.ACCOUNTS}, Parameters.ACCOUNT_PARAMETER);
    this.parameterService = parameterService;
  }

  @Override
  JSONStreamAware processRequest(HttpServletRequest req) throws BurstException {
    return JSONData.accountBalance(parameterService.getAccount(req));
  }

}
