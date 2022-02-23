package binary.wz.spring.beans.processor;

import binary.wz.spring.beans.BeansException;
import binary.wz.spring.beans.PropertyValue;
import binary.wz.spring.beans.PropertyValues;
import binary.wz.spring.beans.factory.ConfigurableListableBeanFactory;
import binary.wz.spring.beans.factory.config.BeanDefinition;
import binary.wz.spring.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为: 字节跳动"));
    }

}
