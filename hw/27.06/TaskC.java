package new27_06;

/**
 * Created by Вождь on 27.06.2017.
 */
public class TaskC {

    public enum HTTPError{
        Bed_Request, Unauthorized, Payment_Required, Forbidden
    }

    public HTTPError FindError(int number){
        HTTPError httpError=null;
        switch (number)
        {
            case 400: httpError = HTTPError.Bed_Request; break;
            case 401: httpError = HTTPError.Unauthorized; break;
            case 402: httpError = HTTPError.Payment_Required; break;
            case 403: httpError = HTTPError.Forbidden; break;
            default:
                System.out.println("No this country");
                System.exit(0);
        }
        return httpError;
    }
}
