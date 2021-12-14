package imt.nordeurope.j2ee.tp.tp1;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.*;

@WebServlet(name = "GraphicWeatherServlet", value = "/GraphicWeatherServlet")

public class GraphicWeatherServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        BufferedImage  bufferedImage  =  new  BufferedImage(200,  200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d  =  bufferedImage.createGraphics();
        g2d.setColor(Color.red); g2d.fill(new  Ellipse2D.Float(0,  0,  200,  100));
        g2d.dispose();
        ImageIO.write(bufferedImage,"jpg",response.getOutputStream());
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
