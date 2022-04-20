package gov.iti.jets.presentation.util;
import java.io.*;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import org.apache.commons.io.FileUtils;

public class AwsImageService {



    public static AwsImageService  INSTANCE = new AwsImageService ();

    private AWSCredentials credentials ;

    private AmazonS3Client amazonS3Client ;

    private String bucketName ;



    private AwsImageService (){

        credentials=new BasicAWSCredentials("AKIA2MAPDCOWNWLS5K76", "pxu3OTSnCGPVddoyPExendzqcv9L4eZSBBlrf9dC");
        amazonS3Client=(AmazonS3Client) AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.EU_CENTRAL_1)
                .build();
        bucketName = "mwebappimages";
    }


    public static AwsImageService  getInstance(){
        return INSTANCE;
    }

    public String uploadImage( InputStream inputStream , String imageName){

        try {
            String imagePath="img/products"+ imageName;
            amazonS3Client.putObject(bucketName,imagePath ,inputStream, null );


            String objectKey=amazonS3Client.getObject(bucketName, imagePath).getKey();
            String objectUrl=amazonS3Client.getResourceUrl(bucketName,objectKey);


            return objectUrl;
        } catch (AmazonServiceException e) {

            e.printStackTrace();
            return "";
        } catch (SdkClientException e) {

            e.printStackTrace();
            return "";
        }
    }

}
