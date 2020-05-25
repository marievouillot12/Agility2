package livraison;


/**
 *
 * When creating a package, it is empty so its weight is only 100grams.
 * We enter the city where it must be delivered and the person to whom it must be delivered.
 *
 * @author Julienne & Marie
 * @version (20 / 03 / 20)
 */
public class Package
{
    public DeliveryNote DeliveryNote;
    //instance variables

    private double weight;
    private String address;
    private String recipient;


    /**
     * Package class constructor
     */
    public Package(String address, String recipient)
    {
        //initializing variables
        this.address = address;
        weight = 0.1;
        this.recipient = recipient;
    }

    public Package(String address, String recipient, double weight)
    {
        //initializing variables
        this.address = address;
        this.weight = weight;
        this.recipient = recipient;
    }

    public Package(double weight)
    {
        //initializing variables
        this.weight = weight;
    }



    /**
     * a getter for the weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * a setter for the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * a getter for the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * a getter for the recipient
     */
    public String getRecipient()
    {

        return recipient;
    }

    /**
     *Method for adding charge to the package
     *
     */
    public double loadingPackage(double charge)
    {
        weight += charge;
        return weight;

    }
}
